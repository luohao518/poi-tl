package com.deepoove.poi.tl.example;

import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.data.Tables;
import com.deepoove.poi.data.style.BorderStyle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Example for OKR")
public class HaisumExample {

	private static Doc getData(){

		Doc report2 = new Doc();
		report2.setTitle1("建筑设计总说明");
		report2.setTitle2("精细化工项目中的建筑设计原则及要点");
		report2.setTitle3("设计说明");

		//level1
		List<DocDetail> level1 = new ArrayList<>();
		DocDetail level1_1 = new DocDetail();
		level1_1.setTitle("一、设计依据");
		//level2
		List<DocDetail> level2 = new ArrayList<>();
		DocDetail level2_1 = new DocDetail();
		level2_1.setTitle("1.1中华人民共和国住房和城乡建设部颁发的《建筑工程设计文件编制深度规定》建质（2016）247号");
//		level2_1.setImage((String) getImage("./src/main/resources/static/img/1.jpg", 1));
		//level3
		List<DocDetail> level3 = new ArrayList<>();
		DocDetail level3_1 = new DocDetail();
		level3_1.setTitle("1.1.1本工程各专业施工图设计图纸包括总平面及单项工程，总平面包含基地内建筑定位，主要道路定位及高程设计，道路及道牙的详图设计。");
//		level3_1.setImage((String) getImage("./src/main/resources/static/img/2.jpg", 1));
		//level4
		List<DocDetail> level4 = new ArrayList<>();
		DocDetail level4_1 = new DocDetail();
		level4_1.setTitle("1.1.1.1室内设计仅为基础装修设计，需二次装修的房间由业主确定，具体由装修公司深化设计，材料的燃烧性能等级应满足《建筑内部装修设计防火规范》GB50222-2017的防火要求。其余部位应做到所有部位土建与装修工程一体化设计，在土建施工时均应事先进行孔洞预留和装修面层固定件的预埋。设计应满足国家和当地的相关规范和规定，并报消防审批后方可施工");
//		level4_1.setImage((String) getImage("./src/main/resources/static/img/ChoutiWallPaper-2021-10-22.jpeg", 1));
		level4.add(level4_1);
		level3_1.setChildLevel(level4);


		level3.add(level3_1);
		level2_1.setChildLevel(level3);
		level2.add(level2_1);
//        DocDetail level2_2 = new DocDetail();
//        level2_2.setTitle("1.2中华人民共和国住房和城乡建设部颁发的《建筑工程设计文件编制深度规定》建质（2016）248号");
//        level2_2.setImage((String) getImage("./src/main/resources/static/img/1.jpg", 1));
//        level2.add(level2_2);



		level1_1.setChildLevel(level2);
		level1.add(level1_1);
        DocDetail level1_2 = new DocDetail();
        level1_2.setTitle("二、设计要求");
        level1.add(level1_2);

		report2.setLevel1(level1);


//        DocDetail level3 = new DocDetail();
//        level3.setTitle("1.1.1本工程各专业施工图设计图纸包括总平面及单项工程，总平面包含基地内建筑定位，主要道路定位及高程设计，道路及道牙的详图设计。");
//        level3.setImage((String) getImage("./src/main/resources/static/img/2.jpg", 1));
//        DocDetail level4 = new DocDetail();
//        level4.setTitle("1.1.1.1室内设计仅为基础装修设计，需二次装修的房间由业主确定，具体由装修公司深化设计，材料的燃烧性能等级应满足《建筑内部装修设计防火规范》GB50222-2017的防火要求。其余部位应做到所有部位土建与装修工程一体化设计，在土建施工时均应事先进行孔洞预留和装修面层固定件的预埋。设计应满足国家和当地的相关规范和规定，并报消防审批后方可施工");
//        level4.setImage((String) getImage("./src/main/resources/static/img/ChoutiWallPaper-2021-10-22.jpeg", 1));
//        report2.setLevel1(level1);
//        report2.setLevel2(level2);
//        report2.setLevel3(level3);
//        report2.setLevel4(level4);

		return report2;
	}
    @Test
    public void testOKRExample() throws Exception {

        Doc doc = getData();
        doc.setTable(Tables.of(new String[][] {
            new String[] { "Song name", "Artist" },
            new String[] { "111", "222" },
            new String[] { "333", "5455" }
        }).border(BorderStyle.DEFAULT).create());
        doc.setImage("src/test/resources/picture/p.jpg");


        XWPFTemplate template = XWPFTemplate.compile("src/test/resources/haisum/jz.docx").render(doc);
        template.writeToFile("target/out_jz.docx");


    }

}
