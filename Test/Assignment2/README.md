# Reflections
## COMPUTER MOUSE

Identify the types of testing you would perform on a computer mouse, to make sure
that it is of the highest quality.
* Water test
* Durability test  
* User test
* Function test


## CATASTROPHIC FAILURE

Find a story where a software system defect had a bad outcome. Describe what
happened. Can you identify a test that would have prevented it?


# INVESTIGATION OF TOOLS

## JUNIT 5
Investigate JUnit 5 (Jupiter). Explain the following, and how they are useful.

* @Tag

@Tag can be used to filter testcases from test plans. 
It can help in create multiple different test plans for different environments, 
different use-cases or any specific requirement. 
You can execute set of tests by including only those tagged tests in test plan OR 
by excluding other tests from test plan.

* @Disabled

Disabled is used to signal that the annotated test class or test method is currently disabled and should not be executed. 
When applied at the class level, all test methods within that class are automatically disabled as well.
* @RepeatedTest
  
RepeatedTest annotation is used to repeat a test for a specific number of times.

* @BeforeEach, @AfterEach

It is used to signal that the annotated method should be executed before/after each @Test method in the current class.
* @BeforeAll, @AfterAll

It is used to signal that the annotated method should be executed before/after all tests in the current test class.
* @DisplayName

We can use @DisplayName to specify a custom name that is easy to read and provide information about the test class and method.
* @Nested

Junit 5 nested tests is used to express the relationship among several groups of tests and to represent tests in hierarchy. @Nested annotation allows you to have an inner class in a test class and that is another test class. Writing proper nested classes improves maintainability and readability of tests and test results.

* assumeFalse, assumeTrue

Assumptions.class in JUnit5 contains a collection of methods that enables us to programmatically decide whether to continue executing the test or skip the further execution.



#MOCKING FRAMEWORKS
Investigate mocking frameworks for your preferred language. Choose at least two frameworks, and answer the questions.
(One could be Mockito, which we saw in class.)
##Mockito vs JMockit 
[Information Source](https://www.baeldung.com/mockito-vs-easymock-vs-jmockit)

* What are their similarities?


* What are their differences?
  

* Which one would you prefer, if any, and why?






