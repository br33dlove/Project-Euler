//
//  main.cpp
//  Project Euler Problem 9
//
//  Created by David Cryer on 26/07/2015.
//  Copyright (c) 2015 David Cryer. All rights reserved.
//

#include <iostream>
#include <cmath>

int main(int argc, const char * argv[]) {
    
    std::cout<<"There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product abc.\n";
    int product = 0;
    
    for (int i(1);i<1000/3;i++) {
        for (int j(i);j<1000-i-j;j++) {
            int k = 1000-i-j;
            if (std::pow(i,2) + std::pow(j,2) == std::pow(k,2)) {
                product = i*j*k;
                std::cout<<"a is "<<i<<", b is "<<j<<", c is "<<k<<"\n";
                break;
            }
        }
    }
    
    std::cout<<"The product abc is "<<product<<"\n";
    
    std::cout<<"Thank you for using this program.\n";
    return 0;
}
