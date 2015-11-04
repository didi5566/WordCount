import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Mapper;

public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable>
{

	private Text word = new Text();

	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException
	{
 
		System.out.println("this is key "+key);
		System.out.println("this is value "+value);
		StringTokenizer itr = new StringTokenizer(value.toString());
	
		while (itr.hasMoreTokens())
		{
			word.set(itr.nextToken());
			context.write(word, new IntWritable(1));
		}
	}
}
