package com.gtp.myhistory.been;

import java.util.List;

public class JsonDate {

    /**
     * total :
     * list : [{"contract_code":"","cust_sap_no":"","create_date":"","create_by":"","status":"","start_date":"","end_date":"","is_print":"","word_url":"","vkorg":"","vkgrp":"","vkbur":"","contract_type":"","year":"","approve_end":"","contract_template_id":"","adjunct_file":"","is_adjunct_file":"","is_terrace":"","is_confirm":"","confirm_by":"","confirm_date":"","is_main":"","mainsapid":"","mainname":"","auditdate":"","maintid":"","deptflag":"","vendorconfirm":"","vendordate":"","cust_bank":"","banknum":"","pone":"","zm_are":"","tuangou":"","zhuanmai":"","yanjiu":"","postcode":"","first_num":"","despt_num":"","tateplayer":"","businesser":"","dealer_id":"","service_address":"","tateplayer_pone":"","city_p_code":"","city_p_name":"","signdate":"","is_mail":"","city_pos_code":"","itemNum ":"","itemlist":[{"contract_item_id":"","status":"","approve_status":"","matkl":"","maktx":"","control":"","vtweg":"","total":"","m10":"","m11":"","m12":"","m1":"","m2":"","m3":"","m4":"","m5":"","m6":"","m7":"","m8":"","m9":"","start_date":"","end_date":"","notes":"","is_back":"","remark":"","office":"","office_name":"","office_pos_code":""}],"areaNum ":"","arealist":[{"create_date":"","province_code":"","province_name":"","city_code":"","city_name":"","area_code":"","area_name":"","status":"","ratio":"","note":""}]}]
     */

    private String total;
    private List<ListBean> list;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * contract_code :
         * cust_sap_no :
         * create_date :
         * create_by :
         * status :
         * start_date :
         * end_date :
         * is_print :
         * word_url :
         * vkorg :
         * vkgrp :
         * vkbur :
         * contract_type :
         * year :
         * approve_end :
         * contract_template_id :
         * adjunct_file :
         * is_adjunct_file :
         * is_terrace :
         * is_confirm :
         * confirm_by :
         * confirm_date :
         * is_main :
         * mainsapid :
         * mainname :
         * auditdate :
         * maintid :
         * deptflag :
         * vendorconfirm :
         * vendordate :
         * cust_bank :
         * banknum :
         * pone :
         * zm_are :
         * tuangou :
         * zhuanmai :
         * yanjiu :
         * postcode :
         * first_num :
         * despt_num :
         * tateplayer :
         * businesser :
         * dealer_id :
         * service_address :
         * tateplayer_pone :
         * city_p_code :
         * city_p_name :
         * signdate :
         * is_mail :
         * city_pos_code :
         * itemNum  :
         * itemlist : [{"contract_item_id":"","status":"","approve_status":"","matkl":"","maktx":"","control":"","vtweg":"","total":"","m10":"","m11":"","m12":"","m1":"","m2":"","m3":"","m4":"","m5":"","m6":"","m7":"","m8":"","m9":"","start_date":"","end_date":"","notes":"","is_back":"","remark":"","office":"","office_name":"","office_pos_code":""}]
         * areaNum  :
         * arealist : [{"create_date":"","province_code":"","province_name":"","city_code":"","city_name":"","area_code":"","area_name":"","status":"","ratio":"","note":""}]
         */

        private String contract_code;
        private String cust_sap_no;
        private String create_date;
        private String create_by;
        private String status;
        private String start_date;
        private String end_date;
        private String is_print;
        private String word_url;
        private String vkorg;
        private String vkgrp;
        private String vkbur;
        private String contract_type;
        private String year;
        private String approve_end;
        private String contract_template_id;
        private String adjunct_file;
        private String is_adjunct_file;
        private String is_terrace;
        private String is_confirm;
        private String confirm_by;
        private String confirm_date;
        private String is_main;
        private String mainsapid;
        private String mainname;
        private String auditdate;
        private String maintid;
        private String deptflag;
        private String vendorconfirm;
        private String vendordate;
        private String cust_bank;
        private String banknum;
        private String pone;
        private String zm_are;
        private String tuangou;
        private String zhuanmai;
        private String yanjiu;
        private String postcode;
        private String first_num;
        private String despt_num;
        private String tateplayer;
        private String businesser;
        private String dealer_id;
        private String service_address;
        private String tateplayer_pone;
        private String city_p_code;
        private String city_p_name;
        private String signdate;
        private String is_mail;
        private String city_pos_code;
        private String itemNum;
        private String areaNum;
        private List<ItemlistBean> itemlist;
        private List<ArealistBean> arealist;

        public String getContract_code() {
            return contract_code;
        }

        public void setContract_code(String contract_code) {
            this.contract_code = contract_code;
        }

        public String getCust_sap_no() {
            return cust_sap_no;
        }

        public void setCust_sap_no(String cust_sap_no) {
            this.cust_sap_no = cust_sap_no;
        }

        public String getCreate_date() {
            return create_date;
        }

        public void setCreate_date(String create_date) {
            this.create_date = create_date;
        }

        public String getCreate_by() {
            return create_by;
        }

        public void setCreate_by(String create_by) {
            this.create_by = create_by;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getStart_date() {
            return start_date;
        }

        public void setStart_date(String start_date) {
            this.start_date = start_date;
        }

        public String getEnd_date() {
            return end_date;
        }

        public void setEnd_date(String end_date) {
            this.end_date = end_date;
        }

        public String getIs_print() {
            return is_print;
        }

        public void setIs_print(String is_print) {
            this.is_print = is_print;
        }

        public String getWord_url() {
            return word_url;
        }

        public void setWord_url(String word_url) {
            this.word_url = word_url;
        }

        public String getVkorg() {
            return vkorg;
        }

        public void setVkorg(String vkorg) {
            this.vkorg = vkorg;
        }

        public String getVkgrp() {
            return vkgrp;
        }

        public void setVkgrp(String vkgrp) {
            this.vkgrp = vkgrp;
        }

        public String getVkbur() {
            return vkbur;
        }

        public void setVkbur(String vkbur) {
            this.vkbur = vkbur;
        }

        public String getContract_type() {
            return contract_type;
        }

        public void setContract_type(String contract_type) {
            this.contract_type = contract_type;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getApprove_end() {
            return approve_end;
        }

        public void setApprove_end(String approve_end) {
            this.approve_end = approve_end;
        }

        public String getContract_template_id() {
            return contract_template_id;
        }

        public void setContract_template_id(String contract_template_id) {
            this.contract_template_id = contract_template_id;
        }

        public String getAdjunct_file() {
            return adjunct_file;
        }

        public void setAdjunct_file(String adjunct_file) {
            this.adjunct_file = adjunct_file;
        }

        public String getIs_adjunct_file() {
            return is_adjunct_file;
        }

        public void setIs_adjunct_file(String is_adjunct_file) {
            this.is_adjunct_file = is_adjunct_file;
        }

        public String getIs_terrace() {
            return is_terrace;
        }

        public void setIs_terrace(String is_terrace) {
            this.is_terrace = is_terrace;
        }

        public String getIs_confirm() {
            return is_confirm;
        }

        public void setIs_confirm(String is_confirm) {
            this.is_confirm = is_confirm;
        }

        public String getConfirm_by() {
            return confirm_by;
        }

        public void setConfirm_by(String confirm_by) {
            this.confirm_by = confirm_by;
        }

        public String getConfirm_date() {
            return confirm_date;
        }

        public void setConfirm_date(String confirm_date) {
            this.confirm_date = confirm_date;
        }

        public String getIs_main() {
            return is_main;
        }

        public void setIs_main(String is_main) {
            this.is_main = is_main;
        }

        public String getMainsapid() {
            return mainsapid;
        }

        public void setMainsapid(String mainsapid) {
            this.mainsapid = mainsapid;
        }

        public String getMainname() {
            return mainname;
        }

        public void setMainname(String mainname) {
            this.mainname = mainname;
        }

        public String getAuditdate() {
            return auditdate;
        }

        public void setAuditdate(String auditdate) {
            this.auditdate = auditdate;
        }

        public String getMaintid() {
            return maintid;
        }

        public void setMaintid(String maintid) {
            this.maintid = maintid;
        }

        public String getDeptflag() {
            return deptflag;
        }

        public void setDeptflag(String deptflag) {
            this.deptflag = deptflag;
        }

        public String getVendorconfirm() {
            return vendorconfirm;
        }

        public void setVendorconfirm(String vendorconfirm) {
            this.vendorconfirm = vendorconfirm;
        }

        public String getVendordate() {
            return vendordate;
        }

        public void setVendordate(String vendordate) {
            this.vendordate = vendordate;
        }

        public String getCust_bank() {
            return cust_bank;
        }

        public void setCust_bank(String cust_bank) {
            this.cust_bank = cust_bank;
        }

        public String getBanknum() {
            return banknum;
        }

        public void setBanknum(String banknum) {
            this.banknum = banknum;
        }

        public String getPone() {
            return pone;
        }

        public void setPone(String pone) {
            this.pone = pone;
        }

        public String getZm_are() {
            return zm_are;
        }

        public void setZm_are(String zm_are) {
            this.zm_are = zm_are;
        }

        public String getTuangou() {
            return tuangou;
        }

        public void setTuangou(String tuangou) {
            this.tuangou = tuangou;
        }

        public String getZhuanmai() {
            return zhuanmai;
        }

        public void setZhuanmai(String zhuanmai) {
            this.zhuanmai = zhuanmai;
        }

        public String getYanjiu() {
            return yanjiu;
        }

        public void setYanjiu(String yanjiu) {
            this.yanjiu = yanjiu;
        }

        public String getPostcode() {
            return postcode;
        }

        public void setPostcode(String postcode) {
            this.postcode = postcode;
        }

        public String getFirst_num() {
            return first_num;
        }

        public void setFirst_num(String first_num) {
            this.first_num = first_num;
        }

        public String getDespt_num() {
            return despt_num;
        }

        public void setDespt_num(String despt_num) {
            this.despt_num = despt_num;
        }

        public String getTateplayer() {
            return tateplayer;
        }

        public void setTateplayer(String tateplayer) {
            this.tateplayer = tateplayer;
        }

        public String getBusinesser() {
            return businesser;
        }

        public void setBusinesser(String businesser) {
            this.businesser = businesser;
        }

        public String getDealer_id() {
            return dealer_id;
        }

        public void setDealer_id(String dealer_id) {
            this.dealer_id = dealer_id;
        }

        public String getService_address() {
            return service_address;
        }

        public void setService_address(String service_address) {
            this.service_address = service_address;
        }

        public String getTateplayer_pone() {
            return tateplayer_pone;
        }

        public void setTateplayer_pone(String tateplayer_pone) {
            this.tateplayer_pone = tateplayer_pone;
        }

        public String getCity_p_code() {
            return city_p_code;
        }

        public void setCity_p_code(String city_p_code) {
            this.city_p_code = city_p_code;
        }

        public String getCity_p_name() {
            return city_p_name;
        }

        public void setCity_p_name(String city_p_name) {
            this.city_p_name = city_p_name;
        }

        public String getSigndate() {
            return signdate;
        }

        public void setSigndate(String signdate) {
            this.signdate = signdate;
        }

        public String getIs_mail() {
            return is_mail;
        }

        public void setIs_mail(String is_mail) {
            this.is_mail = is_mail;
        }

        public String getCity_pos_code() {
            return city_pos_code;
        }

        public void setCity_pos_code(String city_pos_code) {
            this.city_pos_code = city_pos_code;
        }

        public String getItemNum() {
            return itemNum;
        }

        public void setItemNum(String itemNum) {
            this.itemNum = itemNum;
        }

        public String getAreaNum() {
            return areaNum;
        }

        public void setAreaNum(String areaNum) {
            this.areaNum = areaNum;
        }

        public List<ItemlistBean> getItemlist() {
            return itemlist;
        }

        public void setItemlist(List<ItemlistBean> itemlist) {
            this.itemlist = itemlist;
        }

        public List<ArealistBean> getArealist() {
            return arealist;
        }

        public void setArealist(List<ArealistBean> arealist) {
            this.arealist = arealist;
        }

        public static class ItemlistBean {
            /**
             * contract_item_id :
             * status :
             * approve_status :
             * matkl :
             * maktx :
             * control :
             * vtweg :
             * total :
             * m10 :
             * m11 :
             * m12 :
             * m1 :
             * m2 :
             * m3 :
             * m4 :
             * m5 :
             * m6 :
             * m7 :
             * m8 :
             * m9 :
             * start_date :
             * end_date :
             * notes :
             * is_back :
             * remark :
             * office :
             * office_name :
             * office_pos_code :
             */

            private String contract_item_id;
            private String status;
            private String approve_status;
            private String matkl;
            private String maktx;
            private String control;
            private String vtweg;
            private String total;
            private String m10;
            private String m11;
            private String m12;
            private String m1;
            private String m2;
            private String m3;
            private String m4;
            private String m5;
            private String m6;
            private String m7;
            private String m8;
            private String m9;
            private String start_date;
            private String end_date;
            private String notes;
            private String is_back;
            private String remark;
            private String office;
            private String office_name;
            private String office_pos_code;

            public String getContract_item_id() {
                return contract_item_id;
            }

            public void setContract_item_id(String contract_item_id) {
                this.contract_item_id = contract_item_id;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getApprove_status() {
                return approve_status;
            }

            public void setApprove_status(String approve_status) {
                this.approve_status = approve_status;
            }

            public String getMatkl() {
                return matkl;
            }

            public void setMatkl(String matkl) {
                this.matkl = matkl;
            }

            public String getMaktx() {
                return maktx;
            }

            public void setMaktx(String maktx) {
                this.maktx = maktx;
            }

            public String getControl() {
                return control;
            }

            public void setControl(String control) {
                this.control = control;
            }

            public String getVtweg() {
                return vtweg;
            }

            public void setVtweg(String vtweg) {
                this.vtweg = vtweg;
            }

            public String getTotal() {
                return total;
            }

            public void setTotal(String total) {
                this.total = total;
            }

            public String getM10() {
                return m10;
            }

            public void setM10(String m10) {
                this.m10 = m10;
            }

            public String getM11() {
                return m11;
            }

            public void setM11(String m11) {
                this.m11 = m11;
            }

            public String getM12() {
                return m12;
            }

            public void setM12(String m12) {
                this.m12 = m12;
            }

            public String getM1() {
                return m1;
            }

            public void setM1(String m1) {
                this.m1 = m1;
            }

            public String getM2() {
                return m2;
            }

            public void setM2(String m2) {
                this.m2 = m2;
            }

            public String getM3() {
                return m3;
            }

            public void setM3(String m3) {
                this.m3 = m3;
            }

            public String getM4() {
                return m4;
            }

            public void setM4(String m4) {
                this.m4 = m4;
            }

            public String getM5() {
                return m5;
            }

            public void setM5(String m5) {
                this.m5 = m5;
            }

            public String getM6() {
                return m6;
            }

            public void setM6(String m6) {
                this.m6 = m6;
            }

            public String getM7() {
                return m7;
            }

            public void setM7(String m7) {
                this.m7 = m7;
            }

            public String getM8() {
                return m8;
            }

            public void setM8(String m8) {
                this.m8 = m8;
            }

            public String getM9() {
                return m9;
            }

            public void setM9(String m9) {
                this.m9 = m9;
            }

            public String getStart_date() {
                return start_date;
            }

            public void setStart_date(String start_date) {
                this.start_date = start_date;
            }

            public String getEnd_date() {
                return end_date;
            }

            public void setEnd_date(String end_date) {
                this.end_date = end_date;
            }

            public String getNotes() {
                return notes;
            }

            public void setNotes(String notes) {
                this.notes = notes;
            }

            public String getIs_back() {
                return is_back;
            }

            public void setIs_back(String is_back) {
                this.is_back = is_back;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public String getOffice() {
                return office;
            }

            public void setOffice(String office) {
                this.office = office;
            }

            public String getOffice_name() {
                return office_name;
            }

            public void setOffice_name(String office_name) {
                this.office_name = office_name;
            }

            public String getOffice_pos_code() {
                return office_pos_code;
            }

            public void setOffice_pos_code(String office_pos_code) {
                this.office_pos_code = office_pos_code;
            }
        }

        public static class ArealistBean {
            /**
             * create_date :
             * province_code :
             * province_name :
             * city_code :
             * city_name :
             * area_code :
             * area_name :
             * status :
             * ratio :
             * note :
             */

            private String create_date;
            private String province_code;
            private String province_name;
            private String city_code;
            private String city_name;
            private String area_code;
            private String area_name;
            private String status;
            private String ratio;
            private String note;

            public String getCreate_date() {
                return create_date;
            }

            public void setCreate_date(String create_date) {
                this.create_date = create_date;
            }

            public String getProvince_code() {
                return province_code;
            }

            public void setProvince_code(String province_code) {
                this.province_code = province_code;
            }

            public String getProvince_name() {
                return province_name;
            }

            public void setProvince_name(String province_name) {
                this.province_name = province_name;
            }

            public String getCity_code() {
                return city_code;
            }

            public void setCity_code(String city_code) {
                this.city_code = city_code;
            }

            public String getCity_name() {
                return city_name;
            }

            public void setCity_name(String city_name) {
                this.city_name = city_name;
            }

            public String getArea_code() {
                return area_code;
            }

            public void setArea_code(String area_code) {
                this.area_code = area_code;
            }

            public String getArea_name() {
                return area_name;
            }

            public void setArea_name(String area_name) {
                this.area_name = area_name;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getRatio() {
                return ratio;
            }

            public void setRatio(String ratio) {
                this.ratio = ratio;
            }

            public String getNote() {
                return note;
            }

            public void setNote(String note) {
                this.note = note;
            }
        }
    }
}
