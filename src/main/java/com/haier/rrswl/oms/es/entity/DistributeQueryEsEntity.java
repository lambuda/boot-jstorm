package com.haier.rrswl.oms.es.entity;


import lombok.Data;

import java.io.Serializable;

/***
 * oms 运营监控 --> 配送查询 es 实体类
 * 对应 ： TransportationMonitorDTO
 * @Author Lin
 * @Date 2020/5/9 13:20
 **/
@Data
public class DistributeQueryEsEntity implements Serializable {

    private static final long serialVersionUID = -1;


    // 分片键

    private Integer aaa;
    private String lanshouCenterName;     //揽收仓名称
    private String lanshouCenterCode;     //揽收仓
    private String systemStatus;  //订单状态前端
    private String systemStatusName;  //订单状态前端
    private String gmtCreate;     //创建日期 时间
    private String lanshouRkCenterCode;     //揽收入库仓
    private String milestoneCode; //里程碑状态code
    private String dueCkDate;     //揽收入库仓应出时间

    private String belongCenterCode;     //所属仓
    private String issued; //issued
    private String subDueRkDate;     //中转仓应入库日期
    private String subCenter;     //二级仓名称 -- 中转仓
    private String lsStatus;     //揽收订单状态
    private String maxDueRkDate;     //所属仓应入库日期
    private String itemType; //项目大类

    private String orderType;     //订单类型
    private String changeAppointDate;     //用户改约日期
    private String source;     //来源代码 订单来源
    private String personName;     //收货人
    private String collectDate;     //揽收日期日期
    private String searchArea; // 查询范围
    private String personMobile;     //用户手机号
    private String arriveUserDate;     //应到用户日期 时间
    private String add2;//是否原路径
    private String deliveryMethod;     //配送方式
    private String orderNo;     //提单号 揽收单号
    private String sourceSn;     //来源订单号 分片键 不能为空
    private String trackingNo;     //快递单号
    private String carOrderNo;     //始发仓配车单号
    private String sourceSnExtend;//交易单号


    /*private String operationCenterName;//始发仓名称
    private String belongCenterName;//所属仓名称
    private List<String> sourceList;//来源list
    private String handleType;//按钮操作类型
    private String otmStatus;//任务状态
    private String rejectCenter;//拒收中心
    private String rejectCenterName;//拒收中心名称
    private String loginCenter;//登录人中心
    private String loginCenterName;//登录人中心名称
    //查询预约配送的参数
    private String sortName;  //排序字段名
    private String sortDirection;  //排序方式
    private String operationCenterCode;     //始发仓
    private List<String> orderNoList;//提单号多条
    private List<String> sourceSnList;     //来源订单号多条
    private String isAppointment;     //预约配送
    private String orderFlag;     //订单标识
    private String ysFlag;     //预售标记
    private String interceptFlag;     //拦截标记
    private Date startOrderDate;     //订单时间（查询区）
    private Date endOrderDate;     //订单时间（查询区）
    private String startOrderDateStr;
    private String endOrderDateStr;
    private String milestoneName; //里程碑状态中文
    private List<String> milestoneCodeList;
    private String factArriveUserDate;     //实际到用户日期 时间
    private Date startUserDate;     //应到用户开始（查询区）
    private Date endUserDate;     //应到用户结束（查询区）
    private String startUserDateStr;     //应到用户开始String（查询区）
    private String endUserDateStr;     //应到用户结束String（查询区）
    private String orderItem;     //行号
    private String orderDate;     //订单日期 时间
    private String startGmtDateStr;     //创建日期开始String（查询区）
    private String endGmtDateStr;     //创建日期结束String（查询区）
    private String orderStatus;     //订单状态
    private String distributionDelayReasonTypeCode;     //配送延误原因分类Code
    private String distributionDelayReasonTypeName;     //配送延误原因分类
    private String distributionDelaySpecificReason;     //配送延误具体原因
    private String distributionDelayReasonExplain;     //配送延误原因说明
    private String lostCargoResponsibilityCenter;     //丢货责任中心
    private String lostCargoResponsibilityCenterName;     //丢货责任中心名称
    private String lostCargoResponsibilityParty;     //丢货责任方
    private String lostCargoResponsibilityPartyName;     //丢货责任方名称
    private String lostCargoResponsibilityPartyFullName;     //丢货责任方全称
    private String lostCargoResponsibilityPerson;     //丢货责任人
    private String closeOrderDate;     //预计闭单日期
    private String noTransportExceptionPerson;     //异常录入用户
    private String inOutFlag;     //出库回传标记
    private String sendFlag;     //配送完成标记
    private String interfaceDesc;     //订单生成消息

    private String notTimelyType;     //未及时达原因大类
    private String notTimelyTypeName;     //未及时达原因大类名称
    private String notTimeSpecificReasons;     //未及时达具体原因
    private String notTimeSpecificReasonsName;     //未及时达具体原因名称
    private String notTimeRemark;     //未及时达备注
    private String responsibilityCenter;     //责任中心
    private String storeName;     //责任中心名称
    private String responsibleParty;     //责任方
    private String responsiblePartyName;     //责任方

    private String responsiblePartyFullName;     //责任方全称
    private String dispatchDate;     //下发派工日期

    private String returnWdDate;     //回传网点日期
    private String branchCode;     //网点代码
    private String branchName;     //网点名称
    private String matCode;     //产品编码 海尔物料号
    private String matName;     //产品描述
    private String brandName;     //商品品牌名称
    private String matTypeCode;     //品类编码
    private String matTypeName;     //品类名称
    private String totalAmt;     //订单数量
    private String totalVolume;     //体积
    private String totalWeight;     //重量
    private String personProvince;     //省
    private String personCity;     //市
    private String personArea;     //县/区
    private String personTown;     //镇/街道
    private String personAddress;     //收货地址
    private String cutOffTime;     //截单时间
    private Date startCollectDate;     //揽收日期开始（查询区）
    private Date endCollectDate;     //揽收日期结束（查询区）
    private String startCollectDateStr;     //揽收日期开始String（查询区）
    private String endCollectDateStr;     //揽收日期结束String（查询区）
    private String checkOutTime;     //出库考核时间
    private String dueWdDate;     //应到网点日期
    private String factCkDate;     //始发仓出库日期

    private String outboundDelay;     //出库延误
    private List<String> trackingNoLst;     //快递单号
    private String mailNo;     //始发仓运单
    private List<String> mailNoList;     //运单号多个
    private String subDueCkDate;     //中转仓应出库日期
    private String subRkDate;     //二级仓入库日期
    private String subCkDate;     //二级仓出库日期
    private String subWayBill;     //中转仓运单
    private String maxCenter;     //所属仓名称
    private String maxRkDate;     //所属仓入库日期
    private String maxCkDate;     //所属仓出库日期
    private String maxDueCkDate;     //所属仓应出库日期
    private String maxWayBill;     //所属仓运单
    private String deliveryWarehousDate;     //派送仓入库日期
    private String carrierCode;     //车队编码
    private String carrierName;     //车队描述
    private String assignCarTime;     //始发配车时间
    private String subCarTime;     //中转配车时间
    private String maxCarTime;     //所属配车时间
    private String wdGetDate;     //网点收货日期
    private String wdGetType;     //网点收货类型
    private String wdAppointDate;     //网点预约日期
    private String wdDeliverDate;     //网点发货日期
    private String userGetDate;     //用户签收拒收日期（网点）
    private String installResult;     //安装结果
    private String installDate;     //安装日期

    private String invalidDate;     //取消日期 时间
    private String invalidBy;     //取消用户
    private String returnDate;     //回访日期
    private String returnBy;     //回访人
    private String sendUserDelay;     //送用户延误
    private String sendPointDelay;     //送网点延误
    private String ifPassiveAllocation;     //是否被动调拨
    private String rejectionReason;     //拒收原因
    private String rejectionReasonName;     //拒收原因名称
    private String isUnpacking;     //是否开箱
    private String isUnpackingName;     //是否开箱名称
    private String outsourceState;     //外包状态
    private String outsourceStateName;     //外包状态名称
    private String internalMachineState;     //内机状态
    private String internalMachineStateName;     //内机状态名称
    private String enclosureSituation;     //附件情况
    private String enclosureSituationName;     //附件情况
    private String debugStatus; //调试状态
    private String debugStatusName; //调试状态
    private String rejectionRemarkReason;     //拒收备注原因
    private String merchantNotice; //商家通知人
    private String userRequireDate;     //用户要求到货日期 时间
    private String appExceptionReason;     //APP异常原因
    private String waitCkDate;     //转待出库日期

    private String advancePaymentDate;     //预售尾款日期
    private String marketGrade;     //市场等级
    private String belongCkDate;     //所属仓出库日期
    private String jdDeliverDate;     //京东妥投日期

    private String collectAmount;     //待收货款金额
    private String payStatus;     //付款状态
    private String collectionStatus;     //收款状态
    private String confirmAmount;     //确认金额
    private String wdPhone;     //网点电话
    private String distance;     //距离
    private String swingCard;     //刷卡
    private String cash;     //现金
    //    private String ;     //备注
    private String signToReject;     //签改拒类别
    private String matGroup;     //物料组
    private String transportLatticePoinExceptionCode;     //送网点原因分析 code
    private String transportLatticePoinExceptionName;     //送网点原因分析
    private String transportLatticePoinExceptionDetail;     //送网点详细原因分析
    private String noTransportExceptionCode;     //未达原因编码
    private String codeValue;   //联想控件   编码
    private String displayValue;   //联想控件   名称
    private String remark;   //备注

    private String customerServiceTelephone;//客服电话
    private Date changeAppointmentDate;//改约时间

    private String batch; //批次信息
    //-----录入人（登录者）信息
    private String employeeName;
    private String employeeNumber;
    private List<String> spList;   //存放用户拥有的C码权限
    private List<String> roleIdList;   //岗位id值
    private String userRoleId;
    private String userRoleName;
    private List<String> userRoleIdList;   //客户所分配到的多个角色编码


    private String beginXfDate;//始发仓应下发TMS时间
    private String endXfDate;//所属仓应下发TMS时间
    private String beginXfDateFact;//始发仓下发TMS时间
    private String endXfDateFact;//所属仓下发TMS时间
    private String accessCenterListStr; //用户权限仓集合
    private String carNo; //车牌号
    private String verifyResult; //审核结果
    private String ckOrderNo;     //出库提单号
    private String isClose;     //是否闭环
    private String lsOrderStatus;     //揽收订单状态
    private String isDelay;     //是否延误
    private String lsDeliveryParty;     //揽收提货方
    private String infoType;

    private String lanshouRkCenterName;     //揽收入库仓名称
    private List<String> lanshouCenterList;//揽收仓list
    private List<String> lanshouRkCenterList;//揽收入库仓list
    private String transportMethod;
    private String serviceClass;
    private String arrivedOrgCode;
    private String arrivedOrgName;
    private Date customeRequireDate;
    private Date customeInstallDate;
    private Date expectPickupTime;
    private String omsAgingUserDate;
    private String omsAgingCode;
    private int isInvoice;
    private String afterOrderNo;
    private BigDecimal totalAmount;
    private String payType;
    private String tradingStatus;
    private String finalPayment;
    private String matModelVersion; //型号描述
    private String customerMatCode; //商家物料号
    private String rejectDate; //拒收时间
    private String dueRkDate;     //应入库日期
    private String factRkDate;     //入库日期
    private String dueRyDate;     //应入园日期
    private String factRyDate;     //入园日期
    private String relationNo;    //关联单号
    private String toArrivedOrgDate;//到达送达方时间
    private String isSendOutTime;//运营是否超时
    private String laterReason;//延误原因
    private String isUnloadOutTime;//卸货是否超时
    private String isSubRkOutTime;//中转入库是否超期
    private String inReason;     //入库超期原因
    private String timeEffect;     //时效
    private String inReasonName;     //入库超期原因
    private List<String> orderTypeList; //订单类型
    private String lsGmtDate;     //揽收创建日期
    private String dueLsDate;     //应揽收时间
    private List<String> lsStatusList;     //揽收订单状态
    private String ls2zzRkReason;     //揽收仓到中转仓入库超期原因CODE
    private String zz2lsRkReason;     //中转仓到所属仓入库超期原因CODE
    private String ls2zzRkReasonName;     //揽收仓到中转仓入库超期原因Name
    private String zz2lsRkReasonName;     //中转仓到所属仓入库超期原因Name
    private String nodeOperator;     //节点操作人（揽收人）
    private String delayTime;     //延误原因录入时间
    private String inBoundDelay;     //入库是否延误
    private String lsCarTime;     //揽收仓配车时间
    private String lsRkCarTime;     //揽收仓入库配车时间
    private String lsRkcarOrderNo;     //揽收仓入库配车单号
    private String lsRkMailNo;     //揽收入库运单
    private String zzRkBoundDelay;     //中转仓入库是否超期
    private String zzCkBoundDelay;     //中转仓出库延误
    private String ssRkBoundDelay;     //所属仓入库是否超期
    private String ssCkBoundDelay;     //所属仓出库延误
    private String zyCarOrderNo;     //转运配车单号
    private String zyCarTime;     //转运配车时间
    private String zyCarrierCode;     //转运车队编码
    private String zyCarrierName;     //转运车队描述
    private String psCarOrderNo;     //配送配车单号
    private String psCarTime;     //配送配车时间
    private String psCarrierCode;     //配送车队编码
    private String psCarrierName;     //配送车队描述
    private String psMailNo;     //配送用户运单
    private String lsDueRyDate;     //揽收入库仓应入园时间
    private String zzDueRyDate;     //中转入库仓应入园时间
    private String ssDueRyDate;     //所属入库仓应入园时间
    private String zzRkDelayTime;     //中转仓中转入库超期时间
    private String ssRkDelayTime;     //所属仓中转入库超期时间
    private String lsFactRyDate;     //揽收入库仓应入园时间
    private String zzFactRyDate;     //中转入库仓应入园时间
    private String ssFactRyDate;     //所属入库仓应入园时间
    private String lsRyDelay;     //揽收/入园及时/延误
    private String zzXhDelay;     //中转仓卸货是否超时
    private String ssXhDelay;     //所属仓卸货是否超时
    private String gbCode;     //国标码
    private String storage;     //库位
    private List<String> carOrderNoList;     //配车单号多条
    private List<String> systemStatusList;     //订单状态多个
    private List<String> custCodeList;//来源list  类似于sourceList 过期
    private String customCodeList; //前台的list
    private String searchType; //查询类型

    private String generaAmt; //签收数量
    private String noGeneraAmt;  //货损数量
    private String rejectAmt;  //拒签数量
    private String lostAmt;  //丢货数量


    private String lsCenterReason; //揽收延误原因
    private String lsCenterGmtTime;  //揽收仓超期原因录入时间
    private String zzCenterReason;  //中转延误原因
    private String zzCenterGmtTime;  //中转仓超期原因录入时间
    private String ssCenterReason;  //所属延误原因
    private String ssCenterGmtTime;  //所属仓超期原因录入时间

    private String expArriveZzDate;  //预计到达中转仓时间
    private String expArriveSsDate;  //预计到达所属仓时间

    private String zzTrunkDelay;  //中转干线运营是否超时
    private String ssTrunkDelay;  //所属干线运营是否超时

    private String businessName;  //商家名称

    private String trunkMailNo; //干线运单
    private String trunkCarrierCode; //干线车队编码
    private String trunkCarrierName; //干线车队描述

    private String jsResponsibleCenter;        //拒收责任中心
    private String psResponsibleCategory;        //破损责任类别
    private String psResponsibleParty;        //破损责任方
    private String dhResponsibleCenter;        //丢货责任中心
    private String dhResponsibleParty;        //丢货责任方


    private String lsFactRyDateDj;     //揽收入库仓应入园时间(登记操作)
    private String zzFactRyDateDj;     //中转入库仓应入园时间(登记操作)
    private String ssFactRyDateDj;     //所属入库仓应入园时间(登记操作)
    private String nodeSource;     //揽收操作平台
    private String zyMailNo;     //转运运单

    *//**
     * 中转仓入园签到方式
     *//*
    private String zzSignWay;
    *//**
     * 所属仓入园签到方式
     *//*
    private String ssSignWay;

    *//**
     * 运抵时间
     *//*
    private String arriveDate;
    *//**
     * 运抵录入人
     *//*
    private String arriveOperator;

    private List<String> belongCenterCodeList;     //所属仓多条
    private String add9; //包装
    private String customerMatName;  //客户物料描述
    private String xmDeliveryTime; //小米WMS出库时间
    private String installType;     //安装类型
    private String preSaleMark;     //预售标记
    private Date carrierScDate;     //所属仓配车时间
    private String goodsReturnStatus;     //拒收状态
    private Date firstAppointmentDate;     //首次预约时间
    private String nextCode;//下一状态
    private List<String> sourceSnExtendList;//交易单号
    private Date dueCkDateB;//始发仓应出库从
    private String dueCkDateBStr;//始发仓应出库从
    private String dueCkDateEStr;//始发仓应出库至
    private Date subDueRkDateB;//中转仓应入库从
    private Date subDueRkDateE;//中转仓应入库至
    private String subDueRkDateBStr;//中转仓应入库从
    private String subDueRkDateEStr;//中转仓应入库至
    private Date maxDueRkDateB;//所属仓应入库从
    private Date maxDueRkDateE;//所属仓应入库至
    private String maxDueRkDateBStr;//所属仓应入库从
    private String maxDueRkDateEStr;//所属仓应入库至
    private Date changeAppointDateB;//应到用户改约从
    private Date changeAppointDateE;//应到用户改约至
    private String changeAppointDateBStr;//应到用户改约从
    private String changeAppointDateEStr;//应到用户改约至

    private String orderRemark;//订单表备注
    private String specialBill;//特殊计费
    private String money1;//金额1
    private String money2;//金额2
    private String moneyRemark;//金额备注
    private String specialBill2;//特殊计费

*/
}
