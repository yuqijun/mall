/**
* Copyright (C) 2018-2020
* All rights reserved, Designed By www.yixiang.co
* 注意：
* 本软件为www.yixiang.co开发研制
*/
package co.yixiang.print;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 打印订单数据
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderPrint {
	private String title;
	private String price;
	private String num;

	public String getTitle() {
		return title;
	}

	public String getPrice() {
		return price;
	}

	public String getNum() {
		return num;
	}
}
