package telran.git.service;

import java.io.Serializable;
import java.nio.file.Path;
import java.util.List;

import telran.git.model.CommitMessage;
import telran.git.model.FileState;

public interface GitRepository extends Serializable{
	
//default static final
String GIT_FILE = ".mygit";
String commit(String commitMessage);
List<FileState> info();
String createBranch(String branchName);
String renameBranch(String branchName, String newName);
String deleteBranch(String branchName);
List<CommitMessage> log();
List<String> branches();// list of branch names
List<Path> commitContent(String commitName);
String switchTo(String name);//*** name is either a commit name or branch name
String getHead();// returns null if head refers commit with no branch
void save();// saving to .mygit serialization to file (Object Stream)

}
