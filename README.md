# WordCount
This repository is for WordCount on Hadoop(0.20.2)

執行的時候可以利用Eclipse自動幫你產生Jar file或是利用下面指令
#/bin/bash
mkdir ./hadoopJar
javac -cp "/home/didi5566/hadoop-0.20.2/*" -d ./hadoopJar/ *.java
jar -cvf wordcount.jar -C hadoopJar/ .
產生Jar後打
hadoop jar wordcount.jar WordCountDriver input output
即可執行hadoop
