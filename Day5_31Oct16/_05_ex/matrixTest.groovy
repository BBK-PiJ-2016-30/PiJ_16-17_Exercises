//groovy program to text Matrix class

Matrix matTest = new Matrix(3,4);

println("A 3 x 4 matrix intialised with 1's: ")
matTest.prettyPrint();

println("Test setMatrix Method");
str = "1,2,3,4;4,5,6,7;7,8,9,10"
println("Set matrix to " + str)
matTest.setMatrix(str)
matTest.prettyPrint();

