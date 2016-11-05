//groovy program to text Matrix class

Matrix matTest = new Matrix(3,4);

println("A 3 x 4 matrix intialised with 1's: ")
matTest.prettyPrint();

println("Test setElement method");
matTest.setElement(1,1,5)
println("Set 1,1 to 5: ")
matTest.prettyPrint();

println("Test setElement method");
matTest.setElement(6,5,10)
println("Set 6,5 to 10: ")
println("Matrix unchanged as index is out of bounds")
matTest.prettyPrint();


println("Test setRow method");
str = "9,8,7,10"
matTest.setRow(1,str);
println("Row two populated with 9, 8, 7,10: ")
matTest.prettyPrint();

println("Test setCol method");
str = "1,2,3"
matTest.setColumn(1,str);
println("Col two populated with 1, 2, 3: ")
matTest.prettyPrint();

println("Test method toString")
println(matTest.toString())