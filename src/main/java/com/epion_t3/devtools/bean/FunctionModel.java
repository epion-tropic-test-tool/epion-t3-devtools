/* Copyright (c) 2017-2020 Nozomu Takashima. */
package com.epion_t3.devtools.bean;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.Nullable;
import java.util.*;

/**
 * 機能出力モデル.
 *
 * @author takashno
 */
@Getter
@Setter
public class FunctionModel {

    /**
     * Locale.
     */
    private Locale locale;

    /**
     * 機能ラベル.
     */
    private String labelName;

    /**
     * 機能名.
     */
    private String name;

    /**
     * カスタムパッケージ.
     */
    private String customPackage;

    /**
     * 機能概要.
     */
    private List<String> summary;

    /**
     * 機能概要.
     */
    private List<String> description;

    /**
     * コマンド.
     */
    private Map<String, CommandModel> commands = new HashMap<>();

    /**
     * コマンドセット.
     */
    private Set<Map.Entry<String, CommandModel>> commandsEntrySet = commands.entrySet();

    /**
     * メッセージ.
     */
    private Map<String, Property> messages = new HashMap<>();

    /**
     * メッセージセット.
     */
    private Set<Map.Entry<String, Property>> messagesEntrySet = messages.entrySet();

    @Nullable
    public CommandModel getCommand(String id) {
        return commands.get(id);
    }

    /**
     * 概要を追加.
     *
     * @param contents 概要説明
     */
    public void addSummary(String contents) {
        if (summary == null) {
            summary = new ArrayList<>();
        }
        summary.add(contents);
    }

    /**
     * 詳細説明を追加.
     *
     * @param contents 詳細説明
     */
    public void addDescription(String contents) {
        if (description == null) {
            description = new ArrayList<>();
        }
        description.add(contents);
    }

}
