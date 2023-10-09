package com.partha.WorkingWithMono;

import com.partha.WorkingWithMono.service.FileService;
import com.partha.WorkingWithMono.util.Util;

public class Assignment1 {

public static void main(String[] args) {
		
		FileService.read("sample-file.txt")
					.subscribe(Util.onNext(),Util.onError(),Util.onComplete());
		
		FileService.write("sample-file.txt","this is the new line")
					.subscribe(Util.onNext(),Util.onError(),Util.onComplete());

		FileService.read("sample-file.txt")
					.subscribe(Util.onNext(),Util.onError(),Util.onComplete());

		
//		FileService.delete("sample-file.txt")
//					.subscribe(Util.onNext(),Util.onError(),Util.onComplete());

	}


}
