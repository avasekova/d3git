package me.deadcode.adka.d3git;

import java.util.List;
import java.util.Map;

public abstract class GitRepoBrowser {

    private String repositoryPath;

    public GitRepoBrowser(String repositoryPath) {
        this.repositoryPath = repositoryPath;
    }

    public abstract Map<String, List<CommitInfo>> getAllCommits();
    public abstract Map<String, List<CommitInfoDiff>> getAllChanges();

    public String getRepositoryPath() {
        return repositoryPath;
    }
}
