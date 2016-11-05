//ex2 Checking arrays
//groovy script to check ArrayChecker class

ArrayChecker testClass = new ArrayChecker();

ArrayTester arrTest = new ArrayTester();

println(testClass.isSymetrical(arrTest.testArr1));
println(testClass.reverse(arrTest.testArr1));
println(testClass.isSymetrical(arrTest.testArr2));
println(testClass.reverse(arrTest.testArr2));
println(testClass.isSymetrical(arrTest.testArr3));
println(testClass.reverse(arrTest.testArr3));