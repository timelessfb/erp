package edu.uestc.ssmdemo.Model;

import java.io.Serializable;

/**
 * Created by hu on 2018-04-23.
 */
public class Process implements Serializable{

    /**
     * ����״̬����
     * ����LIBU
     * �ȶ���PEIDING
     * Ⱦɫ��RANSE
     * ˮϴ��SHUIXI
     * Ư�ף�PIAOBAI
     * Óˮ��TUOSHUI
     * �ʲ���PAOBU
     * ���ͣ�DINGXING
     * ���DAJUAN
     * ��⣺RUKU
     */
    String process;
    /**
     * ��������״̬
     */
    String processState;

    public void setProcess(String process) {
        this.process = process;
    }

    public void setProcessState(String processState) {
        this.processState = processState;
    }

    public String getProcess() {
        return process;
    }

    public String getProcessState() {
        return processState;
    }
}
