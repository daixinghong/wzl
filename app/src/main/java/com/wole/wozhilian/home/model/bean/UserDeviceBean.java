package com.wole.wozhilian.home.model.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/11/23.
 */

public class UserDeviceBean {


    /**
     * code : 200
     * count : 2
     * data : [{"gparent_name":"sss","parent_name":"设备分类","category_name":"设备分类1","customer_code":"007PV","user_code":"007PZ","equipment_number":10001,"equipment_code":"007PT","equipment_name":"10000110","equipment_sn":"10000110","equipment_status":1},{"gparent_name":null,"parent_name":"设备分类","category_name":"设备分类1","customer_code":"007PV","user_code":"007PZ","equipment_number":10003,"equipment_code":"007PV","equipment_name":"1000102","equipment_sn":"1000102","equipment_status":1}]
     * error :
     */

    private int code;
    private int count;
    private String error;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * gparent_name : sss
         * parent_name : 设备分类
         * category_name : 设备分类1
         * customer_code : 007PV
         * user_code : 007PZ
         * equipment_number : 10001
         * equipment_code : 007PT
         * equipment_name : 10000110
         * equipment_sn : 10000110
         * equipment_status : 1
         */

        private String gparent_name;
        private String parent_name;
        private String category_name;
        private String customer_code;
        private String user_code;
        private int equipment_number;
        private String equipment_code;
        private String equipment_name;
        private String equipment_sn;
        private int equipment_status;

        public String getGparent_name() {
            return gparent_name;
        }

        public void setGparent_name(String gparent_name) {
            this.gparent_name = gparent_name;
        }

        public String getParent_name() {
            return parent_name;
        }

        public void setParent_name(String parent_name) {
            this.parent_name = parent_name;
        }

        public String getCategory_name() {
            return category_name;
        }

        public void setCategory_name(String category_name) {
            this.category_name = category_name;
        }

        public String getCustomer_code() {
            return customer_code;
        }

        public void setCustomer_code(String customer_code) {
            this.customer_code = customer_code;
        }

        public String getUser_code() {
            return user_code;
        }

        public void setUser_code(String user_code) {
            this.user_code = user_code;
        }

        public int getEquipment_number() {
            return equipment_number;
        }

        public void setEquipment_number(int equipment_number) {
            this.equipment_number = equipment_number;
        }

        public String getEquipment_code() {
            return equipment_code;
        }

        public void setEquipment_code(String equipment_code) {
            this.equipment_code = equipment_code;
        }

        public String getEquipment_name() {
            return equipment_name;
        }

        public void setEquipment_name(String equipment_name) {
            this.equipment_name = equipment_name;
        }

        public String getEquipment_sn() {
            return equipment_sn;
        }

        public void setEquipment_sn(String equipment_sn) {
            this.equipment_sn = equipment_sn;
        }

        public int getEquipment_status() {
            return equipment_status;
        }

        public void setEquipment_status(int equipment_status) {
            this.equipment_status = equipment_status;
        }
    }
}
