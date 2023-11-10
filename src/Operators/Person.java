package Operators;

public class Person {
String name;
int age;
double savings;
void increaseTheAgeBy1() {age ++;} // age++ is called an increment operator. There are different short hands in java for operators so we can also use the form age = age+1 
//or age+=1 or age+=10 if we want to add a value such as 10. age+=1 is called an assignment operator. 
//there are other such assignment operators in java such as age-=1; age*=1; age/=1; age%=1


void decreaseTheValueBy1() {//age-- this is a decrement operator, we do not have age** and age// as anything multiplied by 1 is same and anything divided by 1 is also same.
	age-=1;}



void calculateInterestOnSavings() {savings*=1.1;}


}


