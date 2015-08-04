//
//  main.cpp
//  Project Euler Problem 3
//
//  Created by David Cryer on 24/07/2015.
//  Copyright (c) 2015 David Cryer. All rights reserved.
//

#include <iostream>

bool is_prime(const int integer);

int main(int argc, const char * argv[]) {
    // insert code here...
    std::cout<<"What is the largest prime factor of the number 600851475143?\n";
    long number = 600851475143;
    long largest_prime_number(0);
    
    if (number > 1) {
        for (int i(2);i<number/2+1;i++) {
            if (number % i == 0) {
                if (is_prime(i))
                    largest_prime_number = i;
            }
        }
    }
    
    if (largest_prime_number > 1)
        std::cout<<"The largest prime factor of the number 600851475143 is "<<largest_prime_number<<"\n";
    else if (number > 1)
        std::cout<<number<<" is a prime number!\n";
    else
        std::cout<<number<<" is not prime and has no prime factors (is 1, 0, or negative)";
    
    std::cout<<"Thank you for using this program.\n";
    return 0;
}

bool is_prime(const int integer) {
    if (integer > 2) {
        for (int i(2);i<integer/2+1;i++) {
            if (integer % i == 0)
                return false;
        }
        return true;
    }
    else if (integer == 2)
        return true;
    else
        return false;
}