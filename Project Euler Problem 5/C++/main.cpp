//
//  main.cpp
//  Project Euler Problem 5
//
//  Created by David Cryer on 25/07/2015.
//  Copyright (c) 2015 David Cryer. All rights reserved.
//

#include <iostream>

bool is_prime(const int integer);
int get_smallest_prime_factor(const int integer);
int get_uncommon_factors(const int number_1, const int number_2);

int main(int argc, const char * argv[]) {
    
    std::cout<<"What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?\n";
    int multiple(1), number(20);
    
    for (int i(1);i<number+1;i++) {
        if (multiple % i != 0) {
            if (is_prime(i))
                multiple *= i;
            else
                multiple *= get_uncommon_factors(multiple, i);
        }
    }
    
    std::cout<<"The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is "<<multiple<<"\n";
    
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

int get_smallest_prime_factor(const int integer) {
    if (integer > 1) {
        for (int i(2);i<integer/2+1;i++) {
            if (integer % i == 0 && is_prime(i))
                return i;
        }
        return integer;
    }
    else {
        std::cout<<"Error! No prime factors of numbers (incl. number itself) less than 2. Exiting with 1...\n";
        exit(1);
    }
}

int get_uncommon_factors(const int number_1, const int number_2) {
    if (number_2 > 1) {
        if (number_1 % get_smallest_prime_factor(number_2) != 0)
            return get_smallest_prime_factor(number_2) * get_uncommon_factors(number_1/get_smallest_prime_factor(number_2), number_2/get_smallest_prime_factor(number_2));
        else
            return get_uncommon_factors(number_1/get_smallest_prime_factor(number_2), number_2/get_smallest_prime_factor(number_2));
    }
    else if (number_2 == 1)
        return 1;
    else {
        std::cout<<"Error! Cannot get common factors for numbers less than 1. Exiting with 1...\n";
        exit(1);
    }
    
}

