//
//  main.cpp
//  Project Euler Problem 1
//
//  Created by David Cryer on 24/07/2015.
//  Copyright (c) 2015 David Cryer. All rights reserved.
//

#include <iostream>
#include <vector>

int main(int argc, const char * argv[]) {
    
    std::cout<<"Find the sum of all the multiples of 3 or 5 below 1000.\n";
    std::vector<int> vector_multiples;
    vector_multiples.reserve(1000/3);
    int sum_multiples(0);
    
    for(int i(0);i<1000;i++) {
        if (i%3 == 0 || i%5 ==0) {
            vector_multiples.push_back(i);
            sum_multiples += i;
        }
    }
    
    std::cout<<"Multiples of 3 and 5 up to 1000 are: ";
    for (const auto i : vector_multiples)
        std::cout<<i<<" ";
    std::cout<<"\nSum of multiples is: "<<sum_multiples<<std::endl;
    std::cout<<"Thank you for using this program.\n";
    
    return 0;
}
