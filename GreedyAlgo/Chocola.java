// Chocola Problem

// We are given a bar of chocolate composed of mxn square pieces. One should break the chocolate into single squares. 
// Each break of a part of the chocolate is charged a cost expressed by a positive integer. This cost does not depend on 
// the size of the part that is being broken but only depends on the line the break goes along. Let us denote the costs of 
// breaking along consecutive vertical lines with x1, x2, ..., xm-1 and along horizontal lines with y1, y2, ..., yn-1.
// Compute the minimal cost of breaking the whole chocolate into single squares.
package GreedyAlgo;
import java.util.*;

public class Chocola{
public static void main(String[] args){
    int n = 4, m =6;
    Integer CostVer[] = {2,1,3,1,4};
    Integer CostHor[] = {4,1,2};
    
    Arrays.sort(CostVer, Collections.reverseOrder());
    Arrays.sort(CostHor, Collections.reverseOrder());
    int h = 0, v = 0;
    int cost = 0;
    int hp = 1, vp = 1;

    while (h < CostHor.length && v < CostVer.length) {
        if(CostVer[v] <= CostHor[h]){
            cost += CostHor[h] * vp;
            hp++;
            h++;
        }
        else{
            cost += CostVer[v] * hp;
            vp++;
            v++;
        }
    }

    while(h<CostHor.length){
         cost += CostHor[h] * vp;
            hp++;
            h++;
    }
    while (v<CostVer.length) {
        cost += CostVer[v] * hp;
            vp++;
            v++;
    }

    System.out.print(cost);
    }
}