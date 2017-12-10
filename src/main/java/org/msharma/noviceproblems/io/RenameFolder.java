package org.msharma.noviceproblems.io;

import java.io.File;

/**
 * Example to rename a file provide source and target file name as command line argument
 */
class RenameFolder
{
	public static void main(String arr[])
	{
		if(arr.length!=2)
		{
			System.out.println("Usage: java RenameFolder, please provide srcFolder TargetFolder");
		}
		else
		{
			File src=new File(arr[0]); // provide command line argument the source file
			File target=new File(arr[1]); // provide command line argument the target file
			if(!src.exists() || target.exists())
				System.out.println("Either src not exists or target already exists");
			else if(src.renameTo(target))
				System.out.println("Successfully renamed");
			else
				System.out.println("Cannot rename");
		}
	}
}
