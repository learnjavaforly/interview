package com.cl.interview.service;

import java.util.List;


/**
 * service公用类
 * @author wengzhonghui
 *
 * @param <T>
 */
public interface CommonService<T> {

	/**
	 * 查询所有对象
	 * @return
	 */
	List<T> findAll();
	
	/**
	 * 保存对象
	 * @param obj
	 */
	T save(T obj);
	
	/**
	 * 根据ID删除对象
	 * @param id
	 */
	void delete(Integer id);
	
	/**
	 * 根据ID获取一个对象
	 * @param id
	 * @return
	 */
	T getOne(Integer id);

	
	/**
	 * 删除对象集合
	 * @param entities
	 */
	void delete(Iterable<T> entities);
}
