package com.FuXi;

import java.util.List;

public interface PostRepository {
	public void add(Post post);
	public void remove(long id);
	public Post getPostById(long id);
	public List<Post> getAll();
	public void loadData();
	public void saveData();
}
