//
//  main.cpp
//  Project Euler Problem 2
//
//  Created by David Cryer on 24/07/2015.
//  Copyright (c) 2015 David Cryer. All rights reserved.
//

#include <iostream>
#include <vector>

int main(int argc, const char * argv[]) {
    std::cout<<"By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.\n";
    std::vector<int> fibonacci_sequence = {1,2};
    int even_sum_of_fib(0);
    
    while (fibonacci_sequence.at(fibonacci_sequence.size()-1) + fibonacci_sequence.at(fibonacci_sequence.size()-2) < 4000000) {
        fibonacci_sequence.push_back(fibonacci_sequence.at(fibonacci_sequence.size()-1) + fibonacci_sequence.at(fibonacci_sequence.size()-2));
        if (fibonacci_sequence.at(fibonacci_sequence.size()-1) % 2 == 0)
            even_sum_of_fib +=fibonacci_sequence.at(fibonacci_sequence.size()-1);
    }
    
    std::cout<<"Fibonacci sequence below 4 million is: ";
    for (const auto i : fibonacci_sequence)
        std::cout<<i<<" ";
    std::cout<<"\nSum of even numbers in fibonacci sequence below 4 million is: "<<even_sum_of_fib<<"\n";
    
    std::cout<<"Thank you for using this program.\n";
    
    return 0;
}
