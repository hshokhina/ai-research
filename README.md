# ai-research -> Use Case7 with no ai
There are tests for studentConvert method - StudentConverterTest class. For every student from array this methods set one of boolean property as true
depending on other student properties value. With created tests we checked flow for four possible student characteristic: 
honerRoll, exceptional, passed, failed. Aslo there is check for such argument as empty array and null.

Class PlayerAnalyzerTest contains tests for method that calculates score for the player that is based on his\her age, experience,
skills. You might find test for junior player level, normal level amd senior level. Also there is complex unit test with a multiple
amount of players, so we could check that method sum scores correctly. 

Tests are written based on JUnit5, so use corresponding runner to run tests locally.