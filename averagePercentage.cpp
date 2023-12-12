#include<iostream>
using namespace std;

// Function prototype
void calculateAverageAndPercentage(int marks1, int marks2, int marks3, double &average, double &percentage);

int main() {
    // Input marks from the user
    int subject1, subject2, subject3;
    cout << "Enter marks for Subject 1: ";
    cin >> subject1;
    cout << "Enter marks for Subject 2: ";
    cin >> subject2;
    cout << "Enter marks for Subject 3: ";
    cin >> subject3;
    // Declare variables to store the results
    double avg, percent;
    // Call the function using call by value and call by reference
    calculateAverageAndPercentage(subject1, subject2, subject3, avg, percent);

    // Display the results
    cout << "Average marks: " << avg << endl;
    cout << "Percentage: " << percent << "%" << endl;

    return 0;
}

// Function to calculate average and percentage using call by reference
void calculateAverageAndPercentage(int marks1, int marks2, int marks3, double &average, double &percentage) {
    // Calculate average
    average = (marks1 + marks2 + marks3) / 3.0;

    // Calculate percentage
    percentage = (marks1 + marks2 + marks3) / 3.0;
}
