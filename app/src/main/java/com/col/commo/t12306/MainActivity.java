package com.col.commo.t12306;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends Activity {

    private List<HashMap<String, Object>> dataList;
    private SimpleAdapter adapter;
    private ListView simpleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataList = new ArrayList<HashMap<String, Object>>();
        HashMap<String, Object> map;

        String[] Str_chepai =new String[]{"G308","T8","Z50","K818","K1364","K118"};
        String[] Str_start = new String[]{"成都东","成都","成都","成都","成都","成都"};
        String[] Str_end = new String[]{"北京西","北京西","北京西","北京西","北京西","北京西"};
        String[] Str_time = new String[]{"14小时24分","27小时31分","22小时20分","25小时36分","31小时52分","29小时11分"};
        String[] Str_timestart = new String[]{"07:18","09:00","11:42","19:30","21:50","23:59"};
        String[] Str_timeend = new String[]{"21:42","12:31","10:02","21:06","05:42","05:10"};
        String[] Str_ruanwo = new String[]{"商务：4张","软卧：21张","软卧：112张","软卧：23张","软卧：29张","软卧：4张"};
        String[] Str_yingwo = new String[]{"一等：21张","硬卧：206张","硬卧：254张","硬卧：300张","硬卧：322张","硬卧：56张"};
        String[] Str_yingzuo =new String[]{"二等：437张","硬座：698张","硬座：211张","硬座：638张","硬座：661张","硬座：37张"};
        String[] Str_wuzuo = new String[]{"","无座：192张","无座：141张","无座：265张","无座：203张","无座：无"};


//        for(int i = 0 ; i < 10 ; i ++){
//            map = new HashMap<String,Object>();
//            map.put("text_chepai",Str_chepai[i]);
//            map.put("img_Start",R.id.image_start);
//            map.put("text_start",Str_start[i]);
//            map.put("img_jiantou",R.id.jiantou);
//            map.put("text_time",Str_time[i]);
//            map.put("img_end",R.id.image_end);
//            map.put("text_end",Str_end[i]);
//            map.put("time_null","");
//            map.put("text_timestart",Str_timestart[i]);
//            map.put("text_timeend",Str_timeend[i]);
//            map.put("text_runwo",Str_ruanwo[i]);
//            map.put("text_yingwo",Str_yingwo[i]);
//            map.put("text_yingzuo",Str_yingzuo[i]);
//            map.put("text_wuzuo",Str_wuzuo[i]);
//            map.put("zuo_null","");
//            map.put("img_xiala",R.id.xiala);
//            dataList.add(map);
//        }

        map = new HashMap<String,Object>();
        map.put("text_chepai","G308");
        map.put("img_Start",R.drawable.start);
        map.put("text_start","成都东");
        map.put("img_jiantou",R.drawable.jiantou);
        map.put("text_time","14小时24分");
        map.put("img_end",R.drawable.end);
        map.put("text_end","北京西");
        map.put("time_null","");
        map.put("text_timestart","07:18");
        map.put("text_timeend","21:42");
        map.put("text_runwo","商务：4张");
        map.put("text_yingwo","一等：21张");
        map.put("text_yingzuo","二等：437张");
        map.put("text_wuzuo","");
        map.put("zuo_null","");
        map.put("img_xiala",R.drawable.xialao);
        dataList.add(map);

        adapter = new SimpleAdapter(this,dataList,R.layout.simple_list_item_layout,
                new String[]{"text_chepai","img_Start","text_start","img_jiantou","text_time","img_end","text_end","time_null","text_timestart","text_timeend","text_runwo","text_yingwo","text_yingzuo","text_wuzuo","zuo_null","img_xiala"},
                new int[]{R.id.chepai,R.id.image_start,R.id.start,R.id.jiantou,R.id.time,R.id.image_end,R.id.end,R.id.time_null,R.id.time_start,R.id.time_end,R.id.ruanwo,R.id.yingwo,R.id.yingzuo,R.id.wuzuo,R.id.zuo_null,R.id.xiala});
        simpleList = (ListView) findViewById(R.id.array_listview);
        simpleList.setAdapter(adapter);

    }
}
