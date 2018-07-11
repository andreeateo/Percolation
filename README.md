# Percolation
The program implements a percolation algorithm, displaying a UI and estimates the value of the percolation threshold via Monte Carlo simulation. It uses a union–find data type (also known as the disjoint-sets data type).

**Percolation.** Scientists have defined an abstract process known as percolation to model situations like the following: 
- Given a composite system comprised of randomly distributed insulating and metallic materials: what fraction of the materials need to be metallic so that the composite system is an electrical conductor? 
- Given a porous landscape with water on the surface (or oil below), under what conditions will the water be able to drain through to the bottom (or the oil to gush through to the surface)?  

**The model.** The percolation system is modeled using an n-by-n grid of sites. Each site is either open or blocked. A full site is an open site that can be connected to an open site in the top row via a chain of neighboring (left, right, up, down) open sites. The system percolates if there is a full site in the bottom row. 

**The problem.** If sites are independently set to be open with probability *p*, what is the probability that the system percolates?

**Project Structure**
- src: project source code
- src_deps: source file dependencies
- lib_deps: library dependencies
- test: **JUnit** tests
- test_cases: test data files
- nbproject: NetBeans project file
- build.xml

**Prerequisites**

NetBeans IDE - for download and install go to https://netbeans.org/

**Set-up**

1. Download the project on your drive.
2. Import the Java Project in NetBeans.

**Testing**

There are JUnit test files in the test folder.

**Running the program**

1. "InteractivePercolationVisualizer.java" is set as the default main class. This program takes the grid size n as a command-line argument. Then, the user repeatedly clicks sites to open with the mouse. After each site is opened, it draws full sites in light blue, open sites (that aren't full) in white, and blocked sites in black.

2. "PercolationVisualizer.java" takes the name of a file as a command-line argument (test files found in the *test_cases* folder). From that file, it reads the grid size n of the percolation system, creates an n-by-n grid of sites (initially all blocked)and reads in a sequence of sites (row i, column j) to open.

3. "CalculateAvgThreshold.java" calculates the average percolation threshold of a randomly chosen percolation system.

**Author**

Andreea Teodor

**Credits**

This application was written as part of an assignment for: *Algorithms, Part I by Princeton University on Coursera*.
(the source files in the src_deps folder and the test cases were provided as a starter code)
