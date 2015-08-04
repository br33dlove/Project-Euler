//
//  main.cpp
//  Project Euler Problem 12
//
//  Created by David Cryer on 28/07/2015.
//  Copyright (c) 2015 David Cryer. All rights reserved.
//

#include <iostream>

int get_triangular_number(unsigned int ith_no, unsigned int triangular_number);

int main(int argc, const char * argv[]) {
    std::cout<<"What is the value of the first triangle number to have over five hundred divisors?\n";
    
    int divisor_no(0), triangular_no(0), nth_int(1);
    
    while (divisor_no < 501) {
        if (triangular_no != 0)
            triangular_no = 0;
        if (divisor_no != 0)
            divisor_no = 0;
        
        triangular_no = get_triangular_number(nth_int,0);
        
        for (int i(1);i<triangular_no+1;i++) {
            if (triangular_no % i == 0)
                divisor_no++;
        }
        std::cout<<nth_int<<" "<<triangular_no<<" "<<divisor_no<<"\n";
        
        nth_int++;
    }
    
    std::cout<<"The value of the first triangle number to have over five hundred divisors is "<<triangular_no<<"\n";
    
    std::cout<<"Thank you for using this program.\n";
    return 0;
}

int get_triangular_number(unsigned int ith_no, unsigned int triangular_number) {
    if (ith_no > 0)
        return get_triangular_number(ith_no-1, triangular_number+ith_no);
    else
        return triangular_number;
}