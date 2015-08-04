//
//  main.cpp
//  Project Euler Problem 14
//
//  Created by David Cryer on 29/07/2015.
//  Copyright (c) 2015 David Cryer. All rights reserved.
//

#include <iostream>

int get_collatz_length(long element, int chain_length);

int main(int argc, const char * argv[]) {
    std::cout<<"Which starting number, under one million, produces the longest Collatz sequence?\n";
    
    int chain_length(0),number_with_longest_chain(0);
    for(int i(1);i<1000000;i++) {
        int temp_length = get_collatz_length(long(i),0);
        if (chain_length < temp_length) {
            chain_length = temp_length;
            number_with_longest_chain = i;
        }
    }
    std::cout<<"The starting number under one million that produces the longest Collatz sequence is "<<number_with_longest_chain<<" with chain length "<<chain_length<<"\n";
    
    std::cout<<"Thank you for using this program.\n";
    return 0;
}

int get_collatz_length(long element, int chain_length) {
    if (element == 1)
        return chain_length+1;
    else if (element % 2 == 0)
        return get_collatz_length(element/2,chain_length+1);
    else if (element % 2 == 1)
        return get_collatz_length(3*element+1,chain_length+1);
    else
        return -1;
}