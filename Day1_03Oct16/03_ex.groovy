//Yet another loop

String str = System.console().readLine()
int i = Integer.parseInt(str)
while (i < 10) {
i++;
str = System.console().readLine()
int j = Integer.parseInt(str)
if (j == 0) {
break;
} else if (j != 1) {
println j;
}
}
System.out.println("finished");

//reads str from user
//parses to int
//enter loop if i is less than, if not prints finished
//if i is less than 10 then enters while loop
//increments i
//reads another str from user
//parses this to an int places in var j
//checks against conditional
//if j is 0, exits for loop and prints finished
//if j is not equal to 1, prints j then continues in while loop
//if j equal 1 continues in while loop without printing j