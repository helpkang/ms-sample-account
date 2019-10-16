package com.koreanair.common_adapter.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.collections4.comparators.ComparatorChain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayUtil {
	public static enum SORTORDER {
		ASC, DESC;

		private SORTORDER() {
		}
	}

	private static Logger logger = LoggerFactory.getLogger(ArrayUtil.class);

	public static void sortArray(Object[] sortObj, String sortMethodName) {
		Comparator<Object> SORT_ORDER = new Comparator<Object>() {
			public int compare(Object o1, Object o2) {
				int ret = 0;
				try {
					Class[] types = new Class[0];
					Method method1 = o1.getClass().getMethod(sortMethodName, types);
					Object result1 = method1.invoke(o1, new Object[0]);

					Method method2 = o2.getClass().getMethod(sortMethodName, types);
					Object result2 = method2.invoke(o2, new Object[0]);
					if ((result1 instanceof String)) {
						String strResult1 = (String) result1;
						String strResult2 = (String) result2;

						ret = strResult1.compareTo(strResult2);
					}
				} catch (SecurityException ex) {
					ArrayUtil.logger.error("", ex);
				} catch (IllegalArgumentException ex) {
					ArrayUtil.logger.error("", ex);
				} catch (NoSuchMethodException ex) {
					ArrayUtil.logger.error("", ex);
				} catch (IllegalAccessException ex) {
					ArrayUtil.logger.error("", ex);
				} catch (InvocationTargetException ex) {
					ArrayUtil.logger.error("", ex);
				}
				return ret;
			}
		};
		Arrays.sort(sortObj, SORT_ORDER);
	}

	public static void sortArray(Object[] sortObj, String sortMethodName, final SORTORDER order) {
		Comparator<Object> SORT_ORDER = new Comparator<Object>() {
			public int compare(Object o1, Object o2) {
				int ret = 0;
				try {
					Class[] types = new Class[0];
					Method method1 = o1.getClass().getMethod(sortMethodName, types);
					Object result1 = method1.invoke(o1, new Object[0]);

					Method method2 = o2.getClass().getMethod(sortMethodName, types);
					Object result2 = method2.invoke(o2, new Object[0]);
					if ((result1 instanceof String)) {
						String strResult1 = (String) result1;
						String strResult2 = (String) result2;
						if (order.equals(ArrayUtil.SORTORDER.ASC)) {
							ret = strResult1.compareTo(strResult2);
						} else {
							ret = strResult2.compareTo(strResult1);
						}
					}
					if ((result1 instanceof Integer)) {
						Integer strResult1 = (Integer) result1;
						Integer strResult2 = (Integer) result2;
						int liVal1 = strResult1.intValue();
						int liVal2 = strResult2.intValue();
						if (liVal1 > liVal2) {
							ret = 1;
						} else {
							ret = -1;
						}
					}
				} catch (SecurityException ex) {
					ArrayUtil.logger.error("", ex);
				} catch (IllegalArgumentException ex) {
					ArrayUtil.logger.error("", ex);
				} catch (NoSuchMethodException ex) {
					ArrayUtil.logger.error("", ex);
				} catch (IllegalAccessException ex) {
					ArrayUtil.logger.error("", ex);
				} catch (InvocationTargetException ex) {
					ArrayUtil.logger.error("", ex);
				}
				return ret;
			}
		};
		Arrays.sort(sortObj, SORT_ORDER);
	}

	public static void sortCollection(Object sortObj, String sortMethodName) {
		Comparator<Object> SORT_ORDER = new Comparator<Object>() {
			public int compare(Object o1, Object o2) {
				int ret = 0;
				try {
					Class[] types = new Class[0];
					Method method1 = o1.getClass().getMethod(sortMethodName, types);
					Object result1 = method1.invoke(o1);

					Method method2 = o2.getClass().getMethod(sortMethodName, types);
					Object result2 = method2.invoke(o2);
					if ((result1 instanceof String)) {
						String strResult1 = (String) result1;
						String strResult2 = (String) result2;

						ret = strResult1.compareTo(strResult2);
					}
				} catch (SecurityException | IllegalArgumentException | NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
					ArrayUtil.logger.error("", ex);
				}
				return ret;
			}
		};
		Collections.sort((List<Object>)sortObj, SORT_ORDER);
	}

	public static void sortCollection(Object sortObj, String ... sortMethodNames) {
		List<Comparator> comparatorList = new ArrayList<>();
		for(String sortMethodName : sortMethodNames ) {
			Comparator<Object> SORT_ORDER = new Comparator<Object>() {
				public int compare(Object o1, Object o2) {
					int ret = 0;
					try {
						Class[] types = new Class[0];
						Method method1 = o1.getClass().getMethod(sortMethodName, types);
						Object result1 = method1.invoke(o1);

						Method method2 = o2.getClass().getMethod(sortMethodName, types);
						Object result2 = method2.invoke(o2);
						if ((result1 instanceof String)) {
							String strResult1 = (String) result1;
							String strResult2 = (String) result2;

							ret = strResult1.compareTo(strResult2);
						}
					} catch (SecurityException | IllegalArgumentException | NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
						ArrayUtil.logger.error("", ex);
					}
					return ret;
				}
			};

			comparatorList.add(SORT_ORDER);
		}
		ComparatorChain chain = new ComparatorChain(comparatorList);

		Collections.sort((List<Object>)sortObj, chain);
	}

	public static void sortCollection(List<Object> sortObj, String sortMethodName, final SORTORDER order) {
		Comparator<Object> SORT_ORDER = new Comparator<Object>() {
			public int compare(Object o1, Object o2) {
				int ret = 0;
				try {
					Class[] types = new Class[0];
					Method method1 = o1.getClass().getMethod(sortMethodName, types);
					Object result1 = method1.invoke(o1, new Object[0]);

					Method method2 = o2.getClass().getMethod(sortMethodName, types);
					Object result2 = method2.invoke(o2, new Object[0]);
					if ((result1 instanceof String)) {
						String strResult1 = (String) result1;
						String strResult2 = (String) result2;
						if (order.equals(ArrayUtil.SORTORDER.ASC)) {
							ret = strResult1.compareTo(strResult2);
						} else {
							ret = strResult2.compareTo(strResult1);
						}
					}
					if ((result1 instanceof Integer)) {
						Integer strResult1 = (Integer) result1;
						Integer strResult2 = (Integer) result2;
						int liVal1 = strResult1.intValue();
						int liVal2 = strResult2.intValue();
						if (liVal1 > liVal2) {
							ret = 1;
						} else {
							ret = -1;
						}
					}
				} catch (SecurityException ex) {
					ArrayUtil.logger.error("", ex);
				} catch (IllegalArgumentException ex) {
					ArrayUtil.logger.error("", ex);
				} catch (NoSuchMethodException ex) {
					ArrayUtil.logger.error("", ex);
				} catch (IllegalAccessException ex) {
					ArrayUtil.logger.error("", ex);
				} catch (InvocationTargetException ex) {
					ArrayUtil.logger.error("", ex);
				}
				return ret;
			}
		};
		Collections.sort(sortObj, SORT_ORDER);
	}
}
