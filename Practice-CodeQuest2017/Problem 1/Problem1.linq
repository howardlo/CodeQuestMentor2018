<Query Kind="Program">
  <Reference>&lt;RuntimeDirectory&gt;\System.Xml.Serialization.dll</Reference>
  <Namespace>System.Xml.Serialization</Namespace>
</Query>

void Main()
{
	
	
	string[] lines = System.IO.File.ReadAllLines(@"C:\Users\Howard\Source\Repos\CodeQuestMentor2018\Practice-CodeQuest2017\Problem 1\Prob01.in.txt");
	lines.Dump();
	
	foreach(var l in lines) {
		Console.WriteLine(l);
		Console.WriteLine(l);
	}
	
}

// Define other methods and classes here
