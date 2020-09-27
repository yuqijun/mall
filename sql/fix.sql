ALTER TABLE yx_product ADD COLUMN `number`  int(1) DEFAULT 0 COMMENT '数量';

ALTER TABLE yx_order ADD COLUMN `crt_time` datetime   DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间';

ALTER TABLE yx_order ADD COLUMN `upd_time` timestamp   DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间';

ALTER TABLE yx_order ADD COLUMN `coupon_id` INT(15) default "0" COMMENT '更新时间';

ALTER TABLE yx_shop ADD COLUMN `shop_name` varchar(255) NOT NULL  COMMENT '店铺名称';

ALTER TABLE user ADD COLUMN `type_id`  int(2)  COMMENT '用户类型';


ALTER TABLE yx_order ADD COLUMN `shop_id`  int(12) unsigned zerofill NOT NULL COMMENT '店铺id';

ALTER TABLE yx_order ADD COLUMN `status`  int(2)  NOT NULL default 0 COMMENT '订单状态';