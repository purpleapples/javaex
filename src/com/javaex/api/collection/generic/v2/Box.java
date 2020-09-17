package com.javaex.api.collection.generic.v2;


// Generic 이용
// 설계시 Type 미지정, 이후 instantiation 에서 결정

// type parameter : 관례상 명칭
// T: Type
// K: key
// R: return Type
// V: value
public class Box<T> {
	T content;
	
	public Object getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
}
