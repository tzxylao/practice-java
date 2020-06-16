package com.lll.practice.regex;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.core.util.ReUtil;
import cn.hutool.extra.tokenizer.Result;
import cn.hutool.extra.tokenizer.TokenizerEngine;
import cn.hutool.extra.tokenizer.TokenizerUtil;
import cn.hutool.extra.tokenizer.Word;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.github.javafaker.Faker;
import com.github.javafaker.Name;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/**
 * @author: laoliangliang
 * @description: 正则获取数据 + 中文分词
 * @create: 2020/6/9 15:21
 **/
public class RegexExample {
    public static void main(String[] args) {
        //请求列表页
        String listContent = HttpUtil.get("https://www.oschina.net/action/ajax/get_more_news_list?newsType=&p=2");
//使用正则获取所有标题
        List<String> titles = ReUtil.findAll("<span class=\"text-ellipsis\">(.*?)</span>", listContent, 1);
        for (String title : titles) {
            //打印标题
            Console.log(title);
        }

        TokenizerEngine engine = TokenizerUtil.createEngine();
        Result result = engine.parse(JSON.toJSONString(titles));
        System.out.println(CollUtil.join((Iterator<Word>) result, " "));
    }
}
