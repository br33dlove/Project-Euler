//
//  main.cpp
//  Project Euler Problem 10
//
//  Created by David Cryer on 26/07/2015.
//  Copyright (c) 2015 David Cryer. All rights reserved.
//

#include <iostream>

bool is_prime(const int integer);

int main(int argc, const char * argv[]) {
    
    std::cout<<"Find the sum of all the primes below two million.\n";
    int sum_primes(0),limit(2000000);
    
    for (int i(0);i<limit;i++) {
        if (is_prime(i))
            sum_primes += i;
    }
    
    std::cout<<"The sum of all the primes below two million is "<<sum_primes<<"\n";
    
    std::cout<<"Thank you for using this program.\n";
    return 0;
}

bool is_prime(const int integer) {
    if (integer > 1) {
        for(int i(2);i<integer/2+1;i++) {
            if (integer % 2 == 0)
                return false;
        }
        return true;
    }
    else
        return false;
}