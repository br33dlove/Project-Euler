//
//  main.cpp
//  Project Euler Project 4
//
//  Created by David Cryer on 24/07/2015.
//  Copyright (c) 2015 David Cryer. All rights reserved.
//

#include <iostream>
#include <string>

bool is_palindrome(int const integer);

int main(int argc, const char * argv[]) {
    std::cout<<"Find the largest palindrome made from the product of two 3-digit numbers.\n";
    int largest_palindrome(0);
    
    for (int i(100);i<1000;i++) {
        for (int j(i);j<1000;j++) {
            if (is_palindrome(i*j)) {
                if (largest_palindrome < i*j)
                    largest_palindrome = i*j;
            }
        }
    }
    std::cout<<"The largest palindrome made from the product of two 3-digit numbers is "<<largest_palindrome<<"\n";
    
    std::cout<<"Thank you for using this program.\n";
    
    return 0;
}

bool is_palindrome(int const integer) {
    std::string int_string = std::to_string(integer);
    for (int i(0);i<int_string.length()/2;i++) {
        if (int_string.at(i) != int_string.at(int_string.length()-1-i))
            return false;
    }
    return true;
}