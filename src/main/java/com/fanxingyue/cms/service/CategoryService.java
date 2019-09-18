package com.fanxingyue.cms.service;

import java.util.List;

import com.fanxingyue.cms.entity.Category;

public interface CategoryService {

	List<Category> getCategoryByChId(Integer cid);

}
