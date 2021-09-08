//This .java file will only be using pom.xml and hopefully it will work because I am losing hope :)
// How to install Maven: https://www.jetbrains.com/help/idea/convert-a-regular-project-into-a-maven-project.html
// Maven Download: https://maven.apache.org/download.cgi

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;

//Used the example as a template: https://www.geeksforgeeks.org/java-program-to-extract-content-from-a-excel-sheet/
public class OMCExcelData {

    static class OMCExcelDataVariables {

        private double finished;

        private String pen_1;
        private String pen_2;
        private String pen_3;
        private String pen_4;
        private String pen_5;
        private String pen_6;
        private String pen_7;
        private String pen_8;
        private String pen_9;
        private String pen_10;
        private String pen_11;
        private String pen_12;
        private String pen_13;
        private String pen_14;
        private String pen_15;

        private String fork_1;
        private String fork_2;
        private String fork_3;
        private String fork_4;
        private String fork_5;
        private String fork_6;
        private String fork_7;
        private String fork_8;
        private String fork_9;
        private String fork_10;
        private String fork_11;
        private String fork_12;
        private String fork_13;
        private String fork_14;
        private String fork_15;

        private String lamp_1;
        private String lamp_2;
        private String lamp_3;
        private String lamp_4;
        private String lamp_5;
        private String lamp_6;
        private String lamp_7;
        private String lamp_8;
        private String lamp_9;
        private String lamp_10;
        private String lamp_11;
        private String lamp_12;
        private String lamp_13;
        private String lamp_14;
        private String lamp_15;

        private String clock_1;
        private String clock_2;
        private String clock_3;
        private String clock_4;
        private String clock_5;
        private String clock_6;
        private String clock_7;
        private String clock_8;
        private String clock_9;
        private String clock_10;
        private String clock_11;
        private String clock_12;
        private String clock_13;
        private String clock_14;
        private String clock_15;

        private String lens_1;
        private String lens_2;
        private String lens_3;
        private String lens_4;
        private String lens_5;
        private String lens_6;
        private String lens_7;
        private String lens_8;
        private String lens_9;
        private String lens_10;
        private String lens_11;
        private String lens_12;
        private String lens_13;
        private String lens_14;
        private String lens_15;

        private String balloon_1;
        private String balloon_2;
        private String balloon_3;
        private String balloon_4;
        private String balloon_5;
        private String balloon_6;
        private String balloon_7;
        private String balloon_8;
        private String balloon_9;
        private String balloon_10;
        private String balloon_11;
        private String balloon_12;
        private String balloon_13;
        private String balloon_14;
        private String balloon_15;

        private String soap_1;
        private String soap_2;
        private String soap_3;
        private String soap_4;
        private String soap_5;
        private String soap_6;
        private String soap_7;
        private String soap_8;
        private String soap_9;
        private String soap_10;
        private String soap_11;
        private String soap_12;
        private String soap_13;
        private String soap_14;
        private String soap_15;

        private String stick_1;
        private String stick_2;
        private String stick_3;
        private String stick_4;
        private String stick_5;
        private String stick_6;
        private String stick_7;
        private String stick_8;
        private String stick_9;
        private String stick_10;
        private String stick_11;
        private String stick_12;
        private String stick_13;
        private String stick_14;
        private String stick_15;

        private String rope_1;
        private String rope_2;
        private String rope_3;
        private String rope_4;
        private String rope_5;
        private String rope_6;
        private String rope_7;
        private String rope_8;
        private String rope_9;
        private String rope_10;
        private String rope_11;
        private String rope_12;
        private String rope_13;
        private String rope_14;
        private String rope_15;

        private String marble_1;
        private String marble_2;
        private String marble_3;
        private String marble_4;
        private String marble_5;
        private String marble_6;
        private String marble_7;
        private String marble_8;
        private String marble_9;
        private String marble_10;
        private String marble_11;
        private String marble_12;
        private String marble_13;
        private String marble_14;
        private String marble_15;

        public OMCExcelDataVariables() {
        }

        // figure out how to remove the decmial
        public String toString() {
            return String.format("%f - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s- %s - %s - %s" +
                            "- %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s- %s - %s - %s" +
                            "- %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s- %s - %s - %s" +
                            "- %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s- %s - %s - %s" +
                            "- %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s- %s - %s - %s" +
                            "- %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s- %s - %s - %s" +
                            "- %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s- %s - %s - %s" +
                            "- %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s- %s - %s - %s" +
                            "- %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s- %s - %s - %s" +
                            "- %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s- %s - %s - %s", finished, pen_1, pen_2, pen_3,
                    pen_4, pen_5, pen_6, pen_7, pen_8, pen_9, pen_10, pen_11, pen_12, pen_13, pen_14, pen_15, fork_1, fork_2, fork_3, fork_4,
                    fork_5, fork_6, fork_7, fork_8, fork_9, fork_10, fork_11, fork_12, fork_13, fork_14, fork_15, lamp_1, lamp_2, lamp_3,
                    lamp_4, lamp_5, lamp_6, lamp_7, lamp_8, lamp_9, lamp_10, lamp_11, lamp_12, lamp_13, lamp_14, lamp_15, clock_1, clock_2,
                    clock_3, clock_4, clock_5, clock_6, clock_7, clock_8, clock_9, clock_10, clock_11, clock_12, clock_13, clock_14,
                    clock_15, lens_1, lens_2, lens_3, lens_4, lens_5, lens_6, lens_7, lens_8, lens_9, lens_10, lens_11, lens_12, lens_13,
                    lens_14, lens_15, balloon_1, balloon_2, balloon_3, balloon_4, balloon_5, balloon_6, balloon_7, balloon_8, balloon_9,
                    balloon_10, balloon_11, balloon_12, balloon_13, balloon_14, balloon_15, soap_1, soap_2, soap_3, soap_4, soap_5,
                    soap_6, soap_7, soap_8, soap_9, soap_10, soap_11, soap_12, soap_13, soap_14, soap_15, stick_1, stick_2, stick_3,
                    stick_4, stick_5, stick_6, stick_7, stick_8, stick_9, stick_10, stick_11, stick_12, stick_13, stick_14, stick_15,
                    rope_1, rope_2, rope_3, rope_4, rope_5, rope_6, rope_7, rope_8, rope_9, rope_10, rope_11, rope_12, rope_13, rope_14,
                    rope_15, marble_1, marble_2, marble_3, marble_4, marble_5, marble_6, marble_7, marble_8, marble_9, marble_10, marble_11,
                    marble_12, marble_13, marble_14, marble_15);
        }

        public double getFinished() {
            return finished;
        }

        public void setFinished(double finished) {
            this.finished = finished;
        }

        public String getPen_1() {
            return pen_1;
        }

        public void setPen_1(String pen_1) {
            this.pen_1 = pen_1;
        }

        public String getPen_2() {
            return pen_2;
        }

        public void setPen_2(String pen_2) {
            this.pen_2 = pen_2;
        }

        public String getPen_3() {
            return pen_3;
        }

        public void setPen_3(String pen_3) {
            this.pen_3 = pen_3;
        }

        public String getPen_4() {
            return pen_4;
        }

        public void setPen_4(String pen_4) {
            this.pen_4 = pen_4;
        }

        public String getPen_5() {
            return pen_5;
        }

        public void setPen_5(String pen_5) {
            this.pen_5 = pen_5;
        }

        public String getPen_6() {
            return pen_6;
        }

        public void setPen_6(String pen_6) {
            this.pen_6 = pen_6;
        }

        public String getPen_7() {
            return pen_7;
        }

        public void setPen_7(String pen_7) {
            this.pen_7 = pen_7;
        }

        public String getPen_8() {
            return pen_8;
        }

        public void setPen_8(String pen_8) {
            this.pen_8 = pen_8;
        }

        public String getPen_9() {
            return pen_9;
        }

        public void setPen_9(String pen_9) {
            this.pen_9 = pen_9;
        }

        public String getPen_10() {
            return pen_10;
        }

        public void setPen_10(String pen_10) {
            this.pen_10 = pen_10;
        }

        public String getPen_11() {
            return pen_11;
        }

        public void setPen_11(String pen_11) {
            this.pen_11 = pen_11;
        }

        public String getPen_12() {
            return pen_12;
        }

        public void setPen_12(String pen_12) {
            this.pen_12 = pen_12;
        }

        public String getPen_13() {
            return pen_13;
        }

        public void setPen_13(String pen_13) {
            this.pen_13 = pen_13;
        }

        public String getPen_14() {
            return pen_14;
        }

        public void setPen_14(String pen_14) {
            this.pen_14 = pen_14;
        }

        public String getPen_15() {
            return pen_15;
        }

        public void setPen_15(String pen_15) {
            this.pen_15 = pen_15;
        }

        public String getFork_1() {
            return fork_1;
        }

        public void setFork_1(String fork_1) {
            this.fork_1 = fork_1;
        }

        public String getFork_2() {
            return fork_2;
        }

        public void setFork_2(String fork_2) {
            this.fork_2 = fork_2;
        }

        public String getFork_3() {
            return fork_3;
        }

        public void setFork_3(String fork_3) {
            this.fork_3 = fork_3;
        }

        public String getFork_4() {
            return fork_4;
        }

        public void setFork_4(String fork_4) {
            this.fork_4 = fork_4;
        }

        public String getFork_5() {
            return fork_5;
        }

        public void setFork_5(String fork_5) {
            this.fork_5 = fork_5;
        }

        public String getFork_6() {
            return fork_6;
        }

        public void setFork_6(String fork_6) {
            this.fork_6 = fork_6;
        }

        public String getFork_7() {
            return fork_7;
        }

        public void setFork_7(String fork_7) {
            this.fork_7 = fork_7;
        }

        public String getFork_8() {
            return fork_8;
        }

        public void setFork_8(String fork_8) {
            this.fork_8 = fork_8;
        }

        public String getFork_9() {
            return fork_9;
        }

        public void setFork_9(String fork_9) {
            this.fork_9 = fork_9;
        }

        public String getFork_10() {
            return fork_10;
        }

        public void setFork_10(String fork_10) {
            this.fork_10 = fork_10;
        }

        public String getFork_11() {
            return fork_11;
        }

        public void setFork_11(String fork_11) {
            this.fork_11 = fork_11;
        }

        public String getFork_12() {
            return fork_12;
        }

        public void setFork_12(String fork_12) {
            this.fork_12 = fork_12;
        }

        public String getFork_13() {
            return fork_13;
        }

        public void setFork_13(String fork_13) {
            this.fork_13 = fork_13;
        }

        public String getFork_14() {
            return fork_14;
        }

        public void setFork_14(String fork_14) {
            this.fork_14 = fork_14;
        }

        public String getFork_15() {
            return fork_15;
        }

        public void setFork_15(String fork_15) {
            this.fork_15 = fork_15;
        }

        public String getLamp_1() {
            return lamp_1;
        }

        public void setLamp_1(String lamp_1) {
            this.lamp_1 = lamp_1;
        }

        public String getLamp_2() {
            return lamp_2;
        }

        public void setLamp_2(String lamp_2) {
            this.lamp_2 = lamp_2;
        }

        public String getLamp_3() {
            return lamp_3;
        }

        public void setLamp_3(String lamp_3) {
            this.lamp_3 = lamp_3;
        }

        public String getLamp_4() {
            return lamp_4;
        }

        public void setLamp_4(String lamp_4) {
            this.lamp_4 = lamp_4;
        }

        public String getLamp_5() {
            return lamp_5;
        }

        public void setLamp_5(String lamp_5) {
            this.lamp_5 = lamp_5;
        }

        public String getLamp_6() {
            return lamp_6;
        }

        public void setLamp_6(String lamp_6) {
            this.lamp_6 = lamp_6;
        }

        public String getLamp_7() {
            return lamp_7;
        }

        public void setLamp_7(String lamp_7) {
            this.lamp_7 = lamp_7;
        }

        public String getLamp_8() {
            return lamp_8;
        }

        public void setLamp_8(String lamp_8) {
            this.lamp_8 = lamp_8;
        }

        public String getLamp_9() {
            return lamp_9;
        }

        public void setLamp_9(String lamp_9) {
            this.lamp_9 = lamp_9;
        }

        public String getLamp_10() {
            return lamp_10;
        }

        public void setLamp_10(String lamp_10) {
            this.lamp_10 = lamp_10;
        }

        public String getLamp_11() {
            return lamp_11;
        }

        public void setLamp_11(String lamp_11) {
            this.lamp_11 = lamp_11;
        }

        public String getLamp_12() {
            return lamp_12;
        }

        public void setLamp_12(String lamp_12) {
            this.lamp_12 = lamp_12;
        }

        public String getLamp_13() {
            return lamp_13;
        }

        public void setLamp_13(String lamp_13) {
            this.lamp_13 = lamp_13;
        }

        public String getLamp_14() {
            return lamp_14;
        }

        public void setLamp_14(String lamp_14) {
            this.lamp_14 = lamp_14;
        }

        public String getLamp_15() {
            return lamp_15;
        }

        public void setLamp_15(String lamp_15) {
            this.lamp_15 = lamp_15;
        }

        public String getClock_1() {
            return clock_1;
        }

        public void setClock_1(String clock_1) {
            this.clock_1 = clock_1;
        }

        public String getClock_2() {
            return clock_2;
        }

        public void setClock_2(String clock_2) {
            this.clock_2 = clock_2;
        }

        public String getClock_3() {
            return clock_3;
        }

        public void setClock_3(String clock_3) {
            this.clock_3 = clock_3;
        }

        public String getClock_4() {
            return clock_4;
        }

        public void setClock_4(String clock_4) {
            this.clock_4 = clock_4;
        }

        public String getClock_5() {
            return clock_5;
        }

        public void setClock_5(String clock_5) {
            this.clock_5 = clock_5;
        }

        public String getClock_6() {
            return clock_6;
        }

        public void setClock_6(String clock_6) {
            this.clock_6 = clock_6;
        }

        public String getClock_7() {
            return clock_7;
        }

        public void setClock_7(String clock_7) {
            this.clock_7 = clock_7;
        }

        public String getClock_8() {
            return clock_8;
        }

        public void setClock_8(String clock_8) {
            this.clock_8 = clock_8;
        }

        public String getClock_9() {
            return clock_9;
        }

        public void setClock_9(String clock_9) {
            this.clock_9 = clock_9;
        }

        public String getClock_10() {
            return clock_10;
        }

        public void setClock_10(String clock_10) {
            this.clock_10 = clock_10;
        }

        public String getClock_11() {
            return clock_11;
        }

        public void setClock_11(String clock_11) {
            this.clock_11 = clock_11;
        }

        public String getClock_12() {
            return clock_12;
        }

        public void setClock_12(String clock_12) {
            this.clock_12 = clock_12;
        }

        public String getClock_13() {
            return clock_13;
        }

        public void setClock_13(String clock_13) {
            this.clock_13 = clock_13;
        }

        public String getClock_14() {
            return clock_14;
        }

        public void setClock_14(String clock_14) {
            this.clock_14 = clock_14;
        }

        public String getClock_15() {
            return clock_15;
        }

        public void setClock_15(String clock_15) {
            this.clock_15 = clock_15;
        }

        public String getLens_1() {
            return lens_1;
        }

        public void setLens_1(String lens_1) {
            this.lens_1 = lens_1;
        }

        public String getLens_2() {
            return lens_2;
        }

        public void setLens_2(String lens_2) {
            this.lens_2 = lens_2;
        }

        public String getLens_3() {
            return lens_3;
        }

        public void setLens_3(String lens_3) {
            this.lens_3 = lens_3;
        }

        public String getLens_4() {
            return lens_4;
        }

        public void setLens_4(String lens_4) {
            this.lens_4 = lens_4;
        }

        public String getLens_5() {
            return lens_5;
        }

        public void setLens_5(String lens_5) {
            this.lens_5 = lens_5;
        }

        public String getLens_6() {
            return lens_6;
        }

        public void setLens_6(String lens_6) {
            this.lens_6 = lens_6;
        }

        public String getLens_7() {
            return lens_7;
        }

        public void setLens_7(String lens_7) {
            this.lens_7 = lens_7;
        }

        public String getLens_8() {
            return lens_8;
        }

        public void setLens_8(String lens_8) {
            this.lens_8 = lens_8;
        }

        public String getLens_9() {
            return lens_9;
        }

        public void setLens_9(String lens_9) {
            this.lens_9 = lens_9;
        }

        public String getLens_10() {
            return lens_10;
        }

        public void setLens_10(String lens_10) {
            this.lens_10 = lens_10;
        }

        public String getLens_11() {
            return lens_11;
        }

        public void setLens_11(String lens_11) {
            this.lens_11 = lens_11;
        }

        public String getLens_12() {
            return lens_12;
        }

        public void setLens_12(String lens_12) {
            this.lens_12 = lens_12;
        }

        public String getLens_13() {
            return lens_13;
        }

        public void setLens_13(String lens_13) {
            this.lens_13 = lens_13;
        }

        public String getLens_14() {
            return lens_14;
        }

        public void setLens_14(String lens_14) {
            this.lens_14 = lens_14;
        }

        public String getLens_15() {
            return lens_15;
        }

        public void setLens_15(String lens_15) {
            this.lens_15 = lens_15;
        }

        public String getBalloon_1() {
            return balloon_1;
        }

        public void setBalloon_1(String balloon_1) {
            this.balloon_1 = balloon_1;
        }

        public String getBalloon_2() {
            return balloon_2;
        }

        public void setBalloon_2(String balloon_2) {
            this.balloon_2 = balloon_2;
        }

        public String getBalloon_3() {
            return balloon_3;
        }

        public void setBalloon_3(String balloon_3) {
            this.balloon_3 = balloon_3;
        }

        public String getBalloon_4() {
            return balloon_4;
        }

        public void setBalloon_4(String balloon_4) {
            this.balloon_4 = balloon_4;
        }

        public String getBalloon_5() {
            return balloon_5;
        }

        public void setBalloon_5(String balloon_5) {
            this.balloon_5 = balloon_5;
        }

        public String getBalloon_6() {
            return balloon_6;
        }

        public void setBalloon_6(String balloon_6) {
            this.balloon_6 = balloon_6;
        }

        public String getBalloon_7() {
            return balloon_7;
        }

        public void setBalloon_7(String balloon_7) {
            this.balloon_7 = balloon_7;
        }

        public String getBalloon_8() {
            return balloon_8;
        }

        public void setBalloon_8(String balloon_8) {
            this.balloon_8 = balloon_8;
        }

        public String getBalloon_9() {
            return balloon_9;
        }

        public void setBalloon_9(String balloon_9) {
            this.balloon_9 = balloon_9;
        }

        public String getBalloon_10() {
            return balloon_10;
        }

        public void setBalloon_10(String balloon_10) {
            this.balloon_10 = balloon_10;
        }

        public String getBalloon_11() {
            return balloon_11;
        }

        public void setBalloon_11(String balloon_11) {
            this.balloon_11 = balloon_11;
        }

        public String getBalloon_12() {
            return balloon_12;
        }

        public void setBalloon_12(String balloon_12) {
            this.balloon_12 = balloon_12;
        }

        public String getBalloon_13() {
            return balloon_13;
        }

        public void setBalloon_13(String balloon_13) {
            this.balloon_13 = balloon_13;
        }

        public String getBalloon_14() {
            return balloon_14;
        }

        public void setBalloon_14(String balloon_14) {
            this.balloon_14 = balloon_14;
        }

        public String getBalloon_15() {
            return balloon_15;
        }

        public void setBalloon_15(String balloon_15) {
            this.balloon_15 = balloon_15;
        }

        public String getSoap_1() {
            return soap_1;
        }

        public void setSoap_1(String soap_1) {
            this.soap_1 = soap_1;
        }

        public String getSoap_2() {
            return soap_2;
        }

        public void setSoap_2(String soap_2) {
            this.soap_2 = soap_2;
        }

        public String getSoap_3() {
            return soap_3;
        }

        public void setSoap_3(String soap_3) {
            this.soap_3 = soap_3;
        }

        public String getSoap_4() {
            return soap_4;
        }

        public void setSoap_4(String soap_4) {
            this.soap_4 = soap_4;
        }

        public String getSoap_5() {
            return soap_5;
        }

        public void setSoap_5(String soap_5) {
            this.soap_5 = soap_5;
        }

        public String getSoap_6() {
            return soap_6;
        }

        public void setSoap_6(String soap_6) {
            this.soap_6 = soap_6;
        }

        public String getSoap_7() {
            return soap_7;
        }

        public void setSoap_7(String soap_7) {
            this.soap_7 = soap_7;
        }

        public String getSoap_8() {
            return soap_8;
        }

        public void setSoap_8(String soap_8) {
            this.soap_8 = soap_8;
        }

        public String getSoap_9() {
            return soap_9;
        }

        public void setSoap_9(String soap_9) {
            this.soap_9 = soap_9;
        }

        public String getSoap_10() {
            return soap_10;
        }

        public void setSoap_10(String soap_10) {
            this.soap_10 = soap_10;
        }

        public String getSoap_11() {
            return soap_11;
        }

        public void setSoap_11(String soap_11) {
            this.soap_11 = soap_11;
        }

        public String getSoap_12() {
            return soap_12;
        }

        public void setSoap_12(String soap_12) {
            this.soap_12 = soap_12;
        }

        public String getSoap_13() {
            return soap_13;
        }

        public void setSoap_13(String soap_13) {
            this.soap_13 = soap_13;
        }

        public String getSoap_14() {
            return soap_14;
        }

        public void setSoap_14(String soap_14) {
            this.soap_14 = soap_14;
        }

        public String getSoap_15() {
            return soap_15;
        }

        public void setSoap_15(String soap_15) {
            this.soap_15 = soap_15;
        }

        public String getStick_1() {
            return stick_1;
        }

        public void setStick_1(String stick_1) {
            this.stick_1 = stick_1;
        }

        public String getStick_2() {
            return stick_2;
        }

        public void setStick_2(String stick_2) {
            this.stick_2 = stick_2;
        }

        public String getStick_3() {
            return stick_3;
        }

        public void setStick_3(String stick_3) {
            this.stick_3 = stick_3;
        }

        public String getStick_4() {
            return stick_4;
        }

        public void setStick_4(String stick_4) {
            this.stick_4 = stick_4;
        }

        public String getStick_5() {
            return stick_5;
        }

        public void setStick_5(String stick_5) {
            this.stick_5 = stick_5;
        }

        public String getStick_6() {
            return stick_6;
        }

        public void setStick_6(String stick_6) {
            this.stick_6 = stick_6;
        }

        public String getStick_7() {
            return stick_7;
        }

        public void setStick_7(String stick_7) {
            this.stick_7 = stick_7;
        }

        public String getStick_8() {
            return stick_8;
        }

        public void setStick_8(String stick_8) {
            this.stick_8 = stick_8;
        }

        public String getStick_9() {
            return stick_9;
        }

        public void setStick_9(String stick_9) {
            this.stick_9 = stick_9;
        }

        public String getStick_10() {
            return stick_10;
        }

        public void setStick_10(String stick_10) {
            this.stick_10 = stick_10;
        }

        public String getStick_11() {
            return stick_11;
        }

        public void setStick_11(String stick_11) {
            this.stick_11 = stick_11;
        }

        public String getStick_12() {
            return stick_12;
        }

        public void setStick_12(String stick_12) {
            this.stick_12 = stick_12;
        }

        public String getStick_13() {
            return stick_13;
        }

        public void setStick_13(String stick_13) {
            this.stick_13 = stick_13;
        }

        public String getStick_14() {
            return stick_14;
        }

        public void setStick_14(String stick_14) {
            this.stick_14 = stick_14;
        }

        public String getStick_15() {
            return stick_15;
        }

        public void setStick_15(String stick_15) {
            this.stick_15 = stick_15;
        }

        public String getRope_1() {
            return rope_1;
        }

        public void setRope_1(String rope_1) {
            this.rope_1 = rope_1;
        }

        public String getRope_2() {
            return rope_2;
        }

        public void setRope_2(String rope_2) {
            this.rope_2 = rope_2;
        }

        public String getRope_3() {
            return rope_3;
        }

        public void setRope_3(String rope_3) {
            this.rope_3 = rope_3;
        }

        public String getRope_4() {
            return rope_4;
        }

        public void setRope_4(String rope_4) {
            this.rope_4 = rope_4;
        }

        public String getRope_5() {
            return rope_5;
        }

        public void setRope_5(String rope_5) {
            this.rope_5 = rope_5;
        }

        public String getRope_6() {
            return rope_6;
        }

        public void setRope_6(String rope_6) {
            this.rope_6 = rope_6;
        }

        public String getRope_7() {
            return rope_7;
        }

        public void setRope_7(String rope_7) {
            this.rope_7 = rope_7;
        }

        public String getRope_8() {
            return rope_8;
        }

        public void setRope_8(String rope_8) {
            this.rope_8 = rope_8;
        }

        public String getRope_9() {
            return rope_9;
        }

        public void setRope_9(String rope_9) {
            this.rope_9 = rope_9;
        }

        public String getRope_10() {
            return rope_10;
        }

        public void setRope_10(String rope_10) {
            this.rope_10 = rope_10;
        }

        public String getRope_11() {
            return rope_11;
        }

        public void setRope_11(String rope_11) {
            this.rope_11 = rope_11;
        }

        public String getRope_12() {
            return rope_12;
        }

        public void setRope_12(String rope_12) {
            this.rope_12 = rope_12;
        }

        public String getRope_13() {
            return rope_13;
        }

        public void setRope_13(String rope_13) {
            this.rope_13 = rope_13;
        }

        public String getRope_14() {
            return rope_14;
        }

        public void setRope_14(String rope_14) {
            this.rope_14 = rope_14;
        }

        public String getRope_15() {
            return rope_15;
        }

        public void setRope_15(String rope_15) {
            this.rope_15 = rope_15;
        }

        public String getMarble_1() {
            return marble_1;
        }

        public void setMarble_1(String marble_1) {
            this.marble_1 = marble_1;
        }

        public String getMarble_2() {
            return marble_2;
        }

        public void setMarble_2(String marble_2) {
            this.marble_2 = marble_2;
        }

        public String getMarble_3() {
            return marble_3;
        }

        public void setMarble_3(String marble_3) {
            this.marble_3 = marble_3;
        }

        public String getMarble_4() {
            return marble_4;
        }

        public void setMarble_4(String marble_4) {
            this.marble_4 = marble_4;
        }

        public String getMarble_5() {
            return marble_5;
        }

        public void setMarble_5(String marble_5) {
            this.marble_5 = marble_5;
        }

        public String getMarble_6() {
            return marble_6;
        }

        public void setMarble_6(String marble_6) {
            this.marble_6 = marble_6;
        }

        public String getMarble_7() {
            return marble_7;
        }

        public void setMarble_7(String marble_7) {
            this.marble_7 = marble_7;
        }

        public String getMarble_8() {
            return marble_8;
        }

        public void setMarble_8(String marble_8) {
            this.marble_8 = marble_8;
        }

        public String getMarble_9() {
            return marble_9;
        }

        public void setMarble_9(String marble_9) {
            this.marble_9 = marble_9;
        }

        public String getMarble_10() {
            return marble_10;
        }

        public void setMarble_10(String marble_10) {
            this.marble_10 = marble_10;
        }

        public String getMarble_11() {
            return marble_11;
        }

        public void setMarble_11(String marble_11) {
            this.marble_11 = marble_11;
        }

        public String getMarble_12() {
            return marble_12;
        }

        public void setMarble_12(String marble_12) {
            this.marble_12 = marble_12;
        }

        public String getMarble_13() {
            return marble_13;
        }

        public void setMarble_13(String marble_13) {
            this.marble_13 = marble_13;
        }

        public String getMarble_14() {
            return marble_14;
        }

        public void setMarble_14(String marble_14) {
            this.marble_14 = marble_14;
        }

        public String getMarble_15() {
            return marble_15;
        }

        public void setMarble_15(String marble_15) {
            this.marble_15 = marble_15;
        }
    }

    private Object getCellValue(Cell cell) {

        switch (cell.getCellType()) {

            case STRING:
                return cell.getStringCellValue();

            case BOOLEAN:
                return cell.getBooleanCellValue();

            case NUMERIC:
                return cell.getNumericCellValue();
        }
        return null;
    }

    public static class GetContentFromExcelSheets{
        private Object getCellValue(Cell cell){
            switch (cell.getCellType()){
                case STRING:
                    return cell.getStringCellValue();
                case BOOLEAN:
                    return cell.getBooleanCellValue();
                case NUMERIC:
                    return cell.getNumericCellValue();
            }
            return null;
        }

        public List<OMCExcelDataVariables> readDataFromExcelFile (String excelFilePath)
                throws IOException{
            List<OMCExcelDataVariables> listVariables = new ArrayList<OMCExcelDataVariables>();

            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet firstSheet = workbook.getSheetAt(0);

            Iterator<Row> iterator = firstSheet.iterator();

            // installed a counter to count the number of participants from excel
            int counter = 1;

            while(iterator.hasNext()){
                Row nextRow = iterator.next();

                Iterator<Cell> cellIterator = nextRow.cellIterator();
                OMCExcelDataVariables omc = new OMCExcelDataVariables();

                while (cellIterator.hasNext()){
                    Cell nextCell = cellIterator.next();

                    int columnIndex = nextCell.getColumnIndex();
                    switch (columnIndex){
                        case 0:
                            omc.setFinished(counter);
                            counter++;
                            break;

                        case 1:
                            omc.setPen_1((String)getCellValue(nextCell));
                            break;

                        case 2:
                            omc.setPen_2((String)getCellValue(nextCell));
                            break;

                        case 3:
                            omc.setPen_3((String)getCellValue(nextCell));
                            break;

                        case 4:
                            omc.setPen_4((String)getCellValue(nextCell));
                            break;

                        case 5:
                            omc.setPen_5((String)getCellValue(nextCell));
                            break;

                        case 6:
                            omc.setPen_6((String)getCellValue(nextCell));
                            break;

                        case 7:
                            omc.setPen_7((String)getCellValue(nextCell));
                            break;

                        case 8:
                            omc.setPen_8((String)getCellValue(nextCell));
                            break;

                        case 9:
                            omc.setPen_9((String)getCellValue(nextCell));
                            break;

                        case 10:
                            omc.setPen_10((String)getCellValue(nextCell));
                            break;

                        case 11:
                            omc.setPen_11((String)getCellValue(nextCell));
                            break;

                        case 12:
                            omc.setPen_12((String)getCellValue(nextCell));
                            break;

                        case 13:
                            omc.setPen_13((String)getCellValue(nextCell));
                            break;

                        case 14:
                            omc.setPen_14((String)getCellValue(nextCell));
                            break;

                        case 15:
                            omc.setPen_15((String)getCellValue(nextCell));
                            break;

                        case 16:
                            omc.setFork_1((String)getCellValue(nextCell));
                            break;

                        case 17:
                            omc.setFork_2((String)getCellValue(nextCell));
                            break;

                        case 18:
                            omc.setFork_3((String)getCellValue(nextCell));
                            break;

                        case 19:
                            omc.setFork_4((String)getCellValue(nextCell));
                            break;

                        case 20:
                            omc.setFork_5((String)getCellValue(nextCell));
                            break;

                        case 21:
                            omc.setFork_6((String)getCellValue(nextCell));
                            break;

                        case 22:
                            omc.setFork_7((String)getCellValue(nextCell));
                            break;

                        case 23:
                            omc.setFork_8((String)getCellValue(nextCell));
                            break;

                        case 24:
                            omc.setFork_9((String)getCellValue(nextCell));
                            break;

                        case 25:
                            omc.setFork_10((String)getCellValue(nextCell));
                            break;

                        case 26:
                            omc.setFork_11((String)getCellValue(nextCell));
                            break;

                        case 27:
                            omc.setFork_12((String)getCellValue(nextCell));
                            break;

                        case 28:
                            omc.setFork_13((String)getCellValue(nextCell));
                            break;

                        case 29:
                            omc.setFork_14((String)getCellValue(nextCell));
                            break;

                        case 30:
                            omc.setFork_15((String)getCellValue(nextCell));
                            break;

                        case 31:
                            omc.setLamp_1((String)getCellValue(nextCell));
                            break;

                        case 32:
                            omc.setLamp_2((String)getCellValue(nextCell));
                            break;

                        case 33:
                            omc.setLamp_3((String)getCellValue(nextCell));
                            break;

                        case 34:
                            omc.setLamp_4((String)getCellValue(nextCell));
                            break;

                        case 35:
                            omc.setLamp_5((String)getCellValue(nextCell));
                            break;

                        case 36:
                            omc.setLamp_6((String)getCellValue(nextCell));
                            break;

                        case 37:
                            omc.setLamp_7((String)getCellValue(nextCell));
                            break;

                        case 38:
                            omc.setLamp_8((String)getCellValue(nextCell));
                            break;

                        case 39:
                            omc.setLamp_9((String)getCellValue(nextCell));
                            break;

                        case 40:
                            omc.setLamp_10((String)getCellValue(nextCell));
                            break;

                        case 41:
                            omc.setLamp_11((String)getCellValue(nextCell));
                            break;

                        case 42:
                            omc.setLamp_12((String)getCellValue(nextCell));
                            break;

                        case 43:
                            omc.setLamp_13((String)getCellValue(nextCell));
                            break;

                        case 44:
                            omc.setLamp_14((String)getCellValue(nextCell));
                            break;

                        case 45:
                            omc.setLamp_15((String)getCellValue(nextCell));
                            break;

                        case 46:
                            omc.setClock_1((String)getCellValue(nextCell));
                            break;

                        case 47:
                            omc.setClock_2((String)getCellValue(nextCell));
                            break;

                        case 48:
                            omc.setClock_3((String)getCellValue(nextCell));
                            break;

                        case 49:
                            omc.setClock_4((String)getCellValue(nextCell));
                            break;

                        case 50:
                            omc.setClock_5((String)getCellValue(nextCell));
                            break;

                        case 51:
                            omc.setClock_6((String)getCellValue(nextCell));
                            break;

                        case 52:
                            omc.setClock_7((String)getCellValue(nextCell));
                            break;

                        case 53:
                            omc.setClock_8((String)getCellValue(nextCell));
                            break;

                        case 54:
                            omc.setClock_9((String)getCellValue(nextCell));
                            break;

                        case 55:
                            omc.setClock_10((String)getCellValue(nextCell));
                            break;

                        case 56:
                            omc.setClock_11((String)getCellValue(nextCell));
                            break;

                        case 57:
                            omc.setClock_12((String)getCellValue(nextCell));
                            break;

                        case 58:
                            omc.setClock_13((String)getCellValue(nextCell));
                            break;

                        case 59:
                            omc.setClock_14((String)getCellValue(nextCell));
                            break;

                        case 60:
                            omc.setClock_15((String)getCellValue(nextCell));
                            break;

                        case 61:
                            omc.setLens_1((String)getCellValue(nextCell));
                            break;

                        case 62:
                            omc.setLens_2((String)getCellValue(nextCell));
                            break;

                        case 63:
                            omc.setLens_3((String)getCellValue(nextCell));
                            break;

                        case 64:
                            omc.setLens_4((String)getCellValue(nextCell));
                            break;

                        case 65:
                            omc.setLens_5((String)getCellValue(nextCell));
                            break;

                        case 66:
                            omc.setLens_6((String)getCellValue(nextCell));
                            break;

                        case 67:
                            omc.setLens_7((String)getCellValue(nextCell));
                            break;

                        case 68:
                            omc.setLens_8((String)getCellValue(nextCell));
                            break;

                        case 69:
                            omc.setLens_9((String)getCellValue(nextCell));
                            break;

                        case 70:
                            omc.setLens_10((String)getCellValue(nextCell));
                            break;

                        case 71:
                            omc.setLens_11((String)getCellValue(nextCell));
                            break;

                        case 72:
                            omc.setLens_12((String)getCellValue(nextCell));
                            break;

                        case 73:
                            omc.setLens_13((String)getCellValue(nextCell));
                            break;

                        case 74:
                            omc.setLens_14((String)getCellValue(nextCell));
                            break;

                        case 75:
                            omc.setLens_15((String)getCellValue(nextCell));
                            break;

                        case 76:
                            omc.setBalloon_1((String)getCellValue(nextCell));
                            break;

                        case 77:
                            omc.setBalloon_2((String)getCellValue(nextCell));
                            break;

                        case 78:
                            omc.setBalloon_3((String)getCellValue(nextCell));
                            break;

                        case 79:
                            omc.setBalloon_4((String)getCellValue(nextCell));
                            break;

                        case 80:
                            omc.setBalloon_5((String)getCellValue(nextCell));
                            break;

                        case 81:
                            omc.setBalloon_6((String)getCellValue(nextCell));
                            break;

                        case 82:
                            omc.setBalloon_7((String)getCellValue(nextCell));
                            break;

                        case 83:
                            omc.setBalloon_8((String)getCellValue(nextCell));
                            break;

                        case 84:
                            omc.setBalloon_9((String)getCellValue(nextCell));
                            break;

                        case 85:
                            omc.setBalloon_10((String)getCellValue(nextCell));
                            break;

                        case 86:
                            omc.setBalloon_11((String)getCellValue(nextCell));
                            break;

                        case 87:
                            omc.setBalloon_12((String)getCellValue(nextCell));
                            break;

                        case 88:
                            omc.setBalloon_13((String)getCellValue(nextCell));
                            break;

                        case 89:
                            omc.setBalloon_14((String)getCellValue(nextCell));
                            break;

                        case 90:
                            omc.setBalloon_15((String)getCellValue(nextCell));
                            break;

                        case 91:
                            omc.setSoap_1((String)getCellValue(nextCell));
                            break;

                        case 92:
                            omc.setSoap_2((String)getCellValue(nextCell));
                            break;

                        case 93:
                            omc.setSoap_3((String)getCellValue(nextCell));
                            break;

                        case 94:
                            omc.setSoap_4((String)getCellValue(nextCell));
                            break;

                        case 95:
                            omc.setSoap_5((String)getCellValue(nextCell));
                            break;

                        case 96:
                            omc.setSoap_6((String)getCellValue(nextCell));
                            break;

                        case 97:
                            omc.setSoap_7((String)getCellValue(nextCell));
                            break;

                        case 98:
                            omc.setSoap_8((String)getCellValue(nextCell));
                            break;

                        case 99:
                            omc.setSoap_9((String)getCellValue(nextCell));
                            break;

                        case 100:
                            omc.setSoap_10((String)getCellValue(nextCell));
                            break;

                        case 101:
                            omc.setSoap_11((String)getCellValue(nextCell));
                            break;

                        case 102:
                            omc.setSoap_12((String)getCellValue(nextCell));
                            break;

                        case 103:
                            omc.setSoap_13((String)getCellValue(nextCell));
                            break;

                        case 104:
                            omc.setSoap_14((String)getCellValue(nextCell));
                            break;

                        case 105:
                            omc.setSoap_15((String)getCellValue(nextCell));
                            break;

                        case 106:
                            omc.setStick_1((String)getCellValue(nextCell));
                            break;

                        case 107:
                            omc.setStick_2((String)getCellValue(nextCell));
                            break;

                        case 108:
                            omc.setStick_3((String)getCellValue(nextCell));
                            break;

                        case 109:
                            omc.setStick_4((String)getCellValue(nextCell));
                            break;

                        case 110:
                            omc.setStick_5((String)getCellValue(nextCell));
                            break;

                        case 111:
                            omc.setStick_6((String)getCellValue(nextCell));
                            break;

                        case 112:
                            omc.setStick_7((String)getCellValue(nextCell));
                            break;

                        case 113:
                            omc.setStick_8((String)getCellValue(nextCell));
                            break;

                        case 114:
                            omc.setStick_9((String)getCellValue(nextCell));
                            break;

                        case 115:
                            omc.setStick_10((String)getCellValue(nextCell));
                            break;

                        case 116:
                            omc.setStick_11((String)getCellValue(nextCell));
                            break;

                        case 117:
                            omc.setStick_12((String)getCellValue(nextCell));
                            break;

                        case 118:
                            omc.setStick_13((String)getCellValue(nextCell));
                            break;

                        case 119:
                            omc.setStick_14((String)getCellValue(nextCell));
                            break;

                        case 120:
                            omc.setStick_15((String)getCellValue(nextCell));
                            break;

                        case 121:
                            omc.setRope_1((String)getCellValue(nextCell));
                            break;

                        case 122:
                            omc.setRope_2((String)getCellValue(nextCell));
                            break;

                        case 123:
                            omc.setRope_3((String)getCellValue(nextCell));
                            break;

                        case 124:
                            omc.setRope_4((String)getCellValue(nextCell));
                            break;

                        case 125:
                            omc.setRope_5((String)getCellValue(nextCell));
                            break;

                        case 126:
                            omc.setRope_6((String)getCellValue(nextCell));
                            break;

                        case 127:
                            omc.setRope_7((String)getCellValue(nextCell));
                            break;

                        case 128:
                            omc.setRope_8((String)getCellValue(nextCell));
                            break;

                        case 129:
                            omc.setRope_9((String)getCellValue(nextCell));
                            break;

                        case 130:
                            omc.setRope_10((String)getCellValue(nextCell));
                            break;

                        case 131:
                            omc.setRope_11((String)getCellValue(nextCell));
                            break;

                        case 132:
                            omc.setRope_12((String)getCellValue(nextCell));
                            break;

                        case 133:
                            omc.setRope_13((String)getCellValue(nextCell));
                            break;

                        case 134:
                            omc.setRope_14((String)getCellValue(nextCell));
                            break;

                        case 135:
                            omc.setRope_15((String)getCellValue(nextCell));
                            break;

                        case 136:
                            omc.setMarble_1((String)getCellValue(nextCell));
                            break;

                        case 137:
                            omc.setMarble_2((String)getCellValue(nextCell));
                            break;

                        case 138:
                            omc.setMarble_3((String)getCellValue(nextCell));
                            break;

                        case 139:
                            omc.setMarble_4((String)getCellValue(nextCell));
                            break;

                        case 140:
                            omc.setMarble_5((String)getCellValue(nextCell));
                            break;

                        case 141:
                            omc.setMarble_6((String)getCellValue(nextCell));
                            break;

                        case 142:
                            omc.setMarble_7((String)getCellValue(nextCell));
                            break;

                        case 143:
                            omc.setMarble_8((String)getCellValue(nextCell));
                            break;

                        case 144:
                            omc.setMarble_9((String)getCellValue(nextCell));
                            break;

                        case 145:
                            omc.setMarble_10((String)getCellValue(nextCell));
                            break;

                        case 146:
                            omc.setMarble_11((String)getCellValue(nextCell));
                            break;

                        case 147:
                            omc.setMarble_12((String)getCellValue(nextCell));
                            break;

                        case 148:
                            omc.setMarble_13((String)getCellValue(nextCell));
                            break;

                        case 149:
                            omc.setMarble_14((String)getCellValue(nextCell));
                            break;

                        case 150:
                            omc.setMarble_15((String)getCellValue(nextCell));
                            break;
                    }
                }
                listVariables.add(omc);
            }
            workbook.close();
            inputStream.close();

            return listVariables;
        }
    }
    // Creates excel files
    public static void creationOfExcel(List<OMCExcelDataVariables> extratedData, String ratingType, int itNum, int numLoop, int numberOfCreation){
        Map<String, Object[]> master = new TreeMap<String, Object[]>();
        master.put("1", new Object[]{"Participant Number", "Object", "Location", "Type of Rating"});

        //modification of: https://www.geeksforgeeks.org/reading-writing-data-excel-file-using-apache-poi/?ref=rp
        XSSFWorkbook workbook = new XSSFWorkbook();
        Random picker = new Random();

        int noBreaking = numberOfCreation - 3;
        
        //loop is every excel file being made
        for (int j = 1; j <= numberOfCreation; j++) {
            String sheetName = "sheet"+j;
            XSSFSheet sheets = workbook.createSheet(sheetName);
            String naming = ratingType + itNum + "_" + j;

            Map<String, Object[]> snapshot = new TreeMap<String, Object[]>();
            // Validation Sets in the "beginning" of the excel sheet
            // This information will not be in the Master Sheet since it is on every excel file that is being made
            //Creative Pen Validation set:
            snapshot.put("1", new Object[]{ratingType + " Rating of Pen:", "to make a struture"});
            snapshot.put("2", new Object[]{ratingType + " Rating of Pen:", "to hold somthing"});
            snapshot.put("3", new Object[]{ratingType + " Rating of Pen:", "to make a clock"});
            snapshot.put("4", new Object[]{ratingType + " Rating of Pen:", "to make a picture frame"});
            snapshot.put("5", new Object[]{ratingType + " Rating of Pen:", "to make a lighter"});
            snapshot.put("6", new Object[]{ratingType + " Rating of Pen:", "to make a compass"});
            //Uncreative Pen Validation set:
            snapshot.put("7", new Object[]{ratingType + " Rating of Pen:", "write"});
            snapshot.put("8", new Object[]{ratingType + " Rating of Pen:", "draw"});
            snapshot.put("9", new Object[]{ratingType + " Rating of Pen:", "sketch"});
            snapshot.put("10", new Object[]{ratingType + " Rating of Pen:", "eat"});
            snapshot.put("11", new Object[]{ratingType + " Rating of Pen:", "sign"});
            snapshot.put("12", new Object[]{ratingType + " Rating of Pen:", "throw"});
            //Creative Fork Validation set:
            snapshot.put("13", new Object[]{ratingType + " Rating of Fork:", "makeup applicator"});
            snapshot.put("14", new Object[]{ratingType + " Rating of Fork:", "hair brush"});
            snapshot.put("15", new Object[]{ratingType + " Rating of Fork:", "art brush"});
            snapshot.put("16", new Object[]{ratingType + " Rating of Fork:", "burn cooler"});
            snapshot.put("17", new Object[]{ratingType + " Rating of Fork:", "clip"});
            snapshot.put("18", new Object[]{ratingType + " Rating of Fork:", "keychain"});
            //Uncreative Fork Validation set:
            snapshot.put("19", new Object[]{ratingType + " Rating of Fork:", "eating utensil"});
            snapshot.put("20", new Object[]{ratingType + " Rating of Fork:", "cooking utensil"});
            snapshot.put("21", new Object[]{ratingType + " Rating of Fork:", "weapon"});
            snapshot.put("22", new Object[]{ratingType + " Rating of Fork:", "back scratcher"});
            //Creative Lamp Validation set:
            snapshot.put("23", new Object[]{ratingType + " Rating of Lamp:", "a spot light to take better pictures"});
            snapshot.put("24", new Object[]{ratingType + " Rating of Lamp:", "a coat rack"});
            snapshot.put("25", new Object[]{ratingType + " Rating of Lamp:", "an improvised microphone ffor a bedroom dance party"});
            snapshot.put("26", new Object[]{ratingType + " Rating of Lamp:", "an imaginary friend"});
            //Uncreative Lamp Validation set:
            snapshot.put("27", new Object[]{ratingType + " Rating of Lamp:", "light"});
            snapshot.put("28", new Object[]{ratingType + " Rating of Lamp:", "decoration"});
            snapshot.put("29", new Object[]{ratingType + " Rating of Lamp:", "take pictures"});
            //Creative Clock Validation set:
            snapshot.put("30", new Object[]{ratingType + " Rating of Clock:", "pretend you are Alice in wonderland"});
            snapshot.put("31", new Object[]{ratingType + " Rating of Clock:", "hypotism"});
            snapshot.put("32", new Object[]{ratingType + " Rating of Clock:", "a dart board"});
            snapshot.put("33", new Object[]{ratingType + " Rating of Clock:", "use clock hands as drum sticks"});
            snapshot.put("34", new Object[]{ratingType + " Rating of Clock:", "as a step stool"});
            snapshot.put("35", new Object[]{ratingType + " Rating of Clock:", "if shiny, (use as) a mirror"});
            //Uncreative Clock Validation set:
            snapshot.put("36", new Object[]{ratingType + " Rating of Clock:", "time"});
            snapshot.put("37", new Object[]{ratingType + " Rating of Clock:", "decoration"});
            snapshot.put("38", new Object[]{ratingType + " Rating of Clock:", "alarm"});
            //Creative Lens Validation set:
            snapshot.put("39", new Object[]{ratingType + " Rating of Lens:", "to use the sun for heat"});
            snapshot.put("40", new Object[]{ratingType + " Rating of Lens:", "to throw in game of catch"});
            snapshot.put("41", new Object[]{ratingType + " Rating of Lens:", "hang up on wall for decoration"});
            snapshot.put("42", new Object[]{ratingType + " Rating of Lens:", "to hit against something and record noises"});
            //Uncreative Lens Validation set:
            snapshot.put("43", new Object[]{ratingType + " Rating of Lens:", "glasses"});
            snapshot.put("44", new Object[]{ratingType + " Rating of Lens:", "telescope"});
            snapshot.put("45", new Object[]{ratingType + " Rating of Lens:", "eyes"});
            //Creative Balloon Validation set:
            snapshot.put("46", new Object[]{ratingType + " Rating of Balloon:", "a condom"});
            snapshot.put("47", new Object[]{ratingType + " Rating of Balloon:", "a pouch to store things in"});
            snapshot.put("48", new Object[]{ratingType + " Rating of Balloon:", "a condom"});
            //Uncreative Balloon Validation set:
            snapshot.put("49", new Object[]{ratingType + " Rating of Balloon:", "birthday"});
            snapshot.put("50", new Object[]{ratingType + " Rating of Balloon:", "graduation"});
            snapshot.put("51", new Object[]{ratingType + " Rating of Balloon:", "promotion"});
            snapshot.put("52", new Object[]{ratingType + " Rating of Balloon:", "sales"});
            snapshot.put("53", new Object[]{ratingType + " Rating of Balloon:", "celebrations"});
            snapshot.put("54", new Object[]{ratingType + " Rating of Balloon:", "store openings"});
            //Creative Soap Validation set:
            snapshot.put("55", new Object[]{ratingType + " Rating of Soap:", "create sculptures"});
            snapshot.put("56", new Object[]{ratingType + " Rating of Soap:", "use it as paint"});
            snapshot.put("57", new Object[]{ratingType + " Rating of Soap:", "to make reactions"});
            snapshot.put("58", new Object[]{ratingType + " Rating of Soap:", "prank someone into eating it"});
            //Uncreative Soap Validation set:
            snapshot.put("59", new Object[]{ratingType + " Rating of Soap:", "clean body"});
            snapshot.put("60", new Object[]{ratingType + " Rating of Soap:", "wash hands"});
            snapshot.put("61", new Object[]{ratingType + " Rating of Soap:", "clean counters"});
            snapshot.put("62", new Object[]{ratingType + " Rating of Soap:", "wash cars"});
            snapshot.put("63", new Object[]{ratingType + " Rating of Soap:", "punsih kid for cursing"});
            snapshot.put("64", new Object[]{ratingType + " Rating of Soap:", "soak laundry"});
            snapshot.put("65", new Object[]{ratingType + " Rating of Soap:", "science experiment"});
            //Creative Stick Validation set:
            // ** might have to update **
            snapshot.put("66", new Object[]{ratingType + " Rating of Stick:", "brace"});
            snapshot.put("67", new Object[]{ratingType + " Rating of Stick:", "fake antennae"});
            snapshot.put("68", new Object[]{ratingType + " Rating of Stick:", "fake finger"});
            snapshot.put("69", new Object[]{ratingType + " Rating of Stick:", "fake arm"});
            snapshot.put("70", new Object[]{ratingType + " Rating of Stick:", "snowman arm"});
            snapshot.put("71", new Object[]{ratingType + " Rating of Stick:", "use it as a wand"});
            //Uncreative Stick Validation set:
            // ** might have to update **
            snapshot.put("72", new Object[]{ratingType + " Rating of Stick:", "weapon"});
            snapshot.put("73", new Object[]{ratingType + " Rating of Stick:", "fork"});
            snapshot.put("74", new Object[]{ratingType + " Rating of Stick:", "to stir"});
            //Creative Rope Validation set:
            snapshot.put("75", new Object[]{ratingType + " Rating of Rope:", "climb a tree"});
            snapshot.put("76", new Object[]{ratingType + " Rating of Rope:", "pull a tractor out of mud"});
            snapshot.put("77", new Object[]{ratingType + " Rating of Rope:", "use to climb out a window"});
            snapshot.put("78", new Object[]{ratingType + " Rating of Rope:", "laso a bull"});
            //Uncreative Rope Validation set:
            snapshot.put("79", new Object[]{ratingType + " Rating of Rope:", "hold things together"});
            snapshot.put("80", new Object[]{ratingType + " Rating of Rope:", "use it as a leach"});
            snapshot.put("81", new Object[]{ratingType + " Rating of Rope:", "to tie things down"});
            snapshot.put("82", new Object[]{ratingType + " Rating of Rope:", "use it as a scarf"});
            //Creative Marble Validation set:
            snapshot.put("83", new Object[]{ratingType + " Rating of Marble:", "making noise"});
            snapshot.put("84", new Object[]{ratingType + " Rating of Marble:", "weighing down a ballon (if they were in a basket)"});
            snapshot.put("85", new Object[]{ratingType + " Rating of Marble:", "testing to see if something is level"});
            snapshot.put("86", new Object[]{ratingType + " Rating of Marble:", "trying to hold them with your toes as exersise"});
            //Uncreative Marble Validation set:
            snapshot.put("87", new Object[]{ratingType + " Rating of Marble:", "decoration"});
            snapshot.put("88", new Object[]{ratingType + " Rating of Marble:", "counting"});
            snapshot.put("89", new Object[]{ratingType + " Rating of Marble:", "acessory"});

            if(j > noBreaking){
                for (int k = 0; k < numLoop; k++) {
                    int counts = 1;
                    boolean breakLoop = true;
                    while (breakLoop) {
                        // for the code not to break, meaning that it the excel sheet will not meet thee requirement
                        if (counts >= 577) {
                            breakLoop = false;
                            System.out.println("Not enough Pen in " + naming + ".xslx");
                        }else {
                            String temp = extratedData.get(counts).getPen_1();
                            if ((temp != null)) {
                                if (!temp.equals("")) {
                                    String par = Integer.toString(counts);
                                    int rowNumberForMaster = (k + 2) + (j * 100);
                                    String annoying = Integer.toString(rowNumberForMaster);
                                    master.put(annoying, new Object[]{par, "Pen", naming, ratingType});

                                    int counter = k * 15;
                                    counter = counter + 89;
                                    counter++;
                                    String rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getPen_1();
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                    // Once placed into new excel sheet, it gets 'deleted' so it will not be used again
                                    extratedData.get(counts).setPen_1("");

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getPen_2();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                        extratedData.get(counts).setPen_2("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getPen_3();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                        extratedData.get(counts).setPen_3("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getPen_4();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                        extratedData.get(counts).setPen_4("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getPen_5();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                        extratedData.get(counts).setPen_5("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getPen_6();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                        extratedData.get(counts).setPen_6("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getPen_7();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                        extratedData.get(counts).setPen_7("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getPen_8();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                        extratedData.get(counts).setPen_8("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getPen_9();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                        extratedData.get(counts).setPen_9("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getPen_10();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                        extratedData.get(counts).setPen_10("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getPen_11();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                        extratedData.get(counts).setPen_11("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getPen_12();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                        extratedData.get(counts).setPen_12("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getPen_13();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                        extratedData.get(counts).setPen_13("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getPen_14();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                        extratedData.get(counts).setPen_14("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getPen_15();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                        extratedData.get(counts).setPen_15("");
                                    }
                                    breakLoop = false;
                                }
                            }
                        }
                        counts++;
                    }
                }
                for(int k = 0; k < numLoop; k++){
                    int counts = 1;
                    boolean breakLoop = true;
                    while (breakLoop) {
                        if(counts >= 577){
                            breakLoop = false;
                            System.out.println("Not enough Fork in " + naming + ".xslx");
                        }else{
                            String temp = extratedData.get(counts).getFork_1();
                            if ((temp != null)) {
                                if (!temp.equals("")) {
                                    String par = Integer.toString(counts);
                                    int rowNumberForMaster = (k + 12) + (j * 100);
                                    String annoying = Integer.toString(rowNumberForMaster);
                                    master.put(annoying, new Object[]{par, "Fork", naming, ratingType});

                                    int counter = k * 15;
                                    counter = counter + 239;
                                    counter++;
                                    String rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getFork_1();
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                    extratedData.get(counts).setFork_1("");

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getFork_2();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                        extratedData.get(counts).setFork_2("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getFork_3();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                        extratedData.get(counts).setFork_3("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getFork_4();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                        extratedData.get(counts).setFork_4("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getFork_5();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                        extratedData.get(counts).setFork_5("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getFork_6();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                        extratedData.get(counts).setFork_6("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getFork_7();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                        extratedData.get(counts).setFork_7("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getFork_8();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                        extratedData.get(counts).setFork_8("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getFork_9();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                        extratedData.get(counts).setFork_9("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getFork_10();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                        extratedData.get(counts).setFork_10("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getFork_11();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                        extratedData.get(counts).setFork_11("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getFork_12();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                        extratedData.get(counts).setFork_12("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getFork_13();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                        extratedData.get(counts).setFork_13("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getFork_14();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                        extratedData.get(counts).setFork_14("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getFork_15();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                        extratedData.get(counts).setFork_15("");
                                    }
                                    breakLoop = false;
                                }
                            }
                        }
                        counts++;
                    }
                }
                for(int k = 0; k < numLoop; k++) {
                    int counts = 1;
                    boolean breakLoop = true;
                    while (breakLoop) {
                        if(counts >= 577){
                            breakLoop = false;
                            System.out.println("Not enough Lamp in " + naming + ".xslx");
                        }else{
                            String temp = extratedData.get(counts).getLamp_1();
                            if ((temp != null)) {
                                if (!temp.equals("")) {
                                    String par = Integer.toString(counts);
                                    int rowNumberForMaster = (k + 22) + (j * 100);
                                    String annoying = Integer.toString(rowNumberForMaster);
                                    master.put(annoying, new Object[]{par, "Lamp", naming, ratingType});

                                    int counter = k * 15;
                                    counter = counter + 389;
                                    counter++;
                                    String rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLamp_1();
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                    extratedData.get(counts).setLamp_1("");

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLamp_2();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                        extratedData.get(counts).setLamp_2("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLamp_3();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                        extratedData.get(counts).setLamp_3("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLamp_4();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                        extratedData.get(counts).setLamp_4("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLamp_5();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                        extratedData.get(counts).setLamp_5("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLamp_6();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                        extratedData.get(counts).setLamp_6("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLamp_7();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                        extratedData.get(counts).setLamp_7("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLamp_8();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                        extratedData.get(counts).setLamp_8("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLamp_9();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                        extratedData.get(counts).setLamp_9("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLamp_10();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                        extratedData.get(counts).setLamp_10("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLamp_11();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                        extratedData.get(counts).setLamp_11("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLamp_12();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                        extratedData.get(counts).setLamp_12("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLamp_13();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                        extratedData.get(counts).setLamp_13("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLamp_14();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                        extratedData.get(counts).setLamp_14("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLamp_15();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                        extratedData.get(counts).setLamp_15("");
                                    }
                                    breakLoop = false;
                                }
                            }
                        }
                        counts++;
                    }
                }
                for(int k = 0; k < numLoop; k++) {
                    int counts = 1;
                    boolean breakLoop = true;
                    while (breakLoop) {
                        if (counts >= 577) {
                            breakLoop = false;
                            System.out.println("Not enough Clock in " + naming + ".xslx");
                        } else {
                            String temp = extratedData.get(counts).getClock_1();
                            if ((temp != null)) {
                                if (!temp.equals("")) {
                                    String par = Integer.toString(counts);
                                    int rowNumberForMaster = (k + 32) + (j * 100);
                                    String annoying = Integer.toString(rowNumberForMaster);
                                    master.put(annoying, new Object[]{par, "Clock", naming, ratingType});

                                    int counter = k * 15;
                                    counter = counter + 539;
                                    counter++;
                                    String rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getClock_1();
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                    extratedData.get(counts).setClock_1("");

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getClock_2();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                        extratedData.get(counts).setClock_2("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getClock_3();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                        extratedData.get(counts).setClock_3("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getClock_4();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                        extratedData.get(counts).setClock_4("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getClock_5();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                        extratedData.get(counts).setClock_5("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getClock_6();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                        extratedData.get(counts).setClock_6("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getClock_7();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                        extratedData.get(counts).setClock_7("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getClock_8();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                        extratedData.get(counts).setClock_8("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getClock_9();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                        extratedData.get(counts).setClock_9("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getClock_10();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                        extratedData.get(counts).setClock_10("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getClock_11();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                        extratedData.get(counts).setClock_11("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getClock_12();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                        extratedData.get(counts).setClock_12("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getClock_13();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                        extratedData.get(counts).setClock_13("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getClock_14();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                        extratedData.get(counts).setClock_14("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getClock_15();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                        extratedData.get(counts).setClock_15("");
                                    }
                                    breakLoop = false;
                                }
                            }
                        }
                        counts++;
                    }
                }
                for(int k = 0; k < numLoop; k++) {
                    int counts = 1;
                    boolean breakLoop = true;
                    while (breakLoop) {
                        if (counts >= 577) {
                            breakLoop = false;
                            System.out.println("Not enough Lens in " + naming + ".xslx");
                        } else {
                            String temp = extratedData.get(counts).getLens_1();
                            if ((temp != null)) {
                                if (!temp.equals("")) {
                                    String par = Integer.toString(counts);
                                    int rowNumberForMaster = (k + 42) + (j * 100);
                                    String annoying = Integer.toString(rowNumberForMaster);
                                    master.put(annoying, new Object[]{par, "Lens", naming, ratingType});

                                    int counter = k * 15;
                                    counter = counter + 689;
                                    counter++;
                                    String rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLens_1();
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                    extratedData.get(counts).setLens_1("");

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLens_2();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                        extratedData.get(counts).setLens_2("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLens_3();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                        extratedData.get(counts).setLens_3("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLens_4();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                        extratedData.get(counts).setLens_4("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLens_5();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                        extratedData.get(counts).setLens_5("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLens_6();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                        extratedData.get(counts).setLens_6("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLens_7();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                        extratedData.get(counts).setLens_7("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLens_8();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                        extratedData.get(counts).setLens_8("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLens_9();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                        extratedData.get(counts).setLens_9("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLens_10();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                        extratedData.get(counts).setLens_10("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLens_11();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                        extratedData.get(counts).setLens_11("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLens_12();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                        extratedData.get(counts).setLens_12("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLens_13();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                        extratedData.get(counts).setLens_13("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLens_14();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                        extratedData.get(counts).setLens_14("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getLens_15();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                        extratedData.get(counts).setLens_15("");
                                    }
                                    breakLoop = false;
                                }
                            }
                        }
                        counts++;
                    }
                }
                for(int k = 0; k < numLoop; k++) {
                    int counts = 1;
                    boolean breakLoop = true;
                    while (breakLoop) {
                        if (counts >= 577) {
                            breakLoop = false;
                            System.out.println("Not enough Balloon in " + naming + ".xslx");
                        } else {
                            String temp = extratedData.get(counts).getBalloon_1();
                            if ((temp != null)) {
                                if (!temp.equals("")) {
                                    String par = Integer.toString(counts);
                                    int rowNumberForMaster = (k + 52) + (j * 100);
                                    String annoying = Integer.toString(rowNumberForMaster);
                                    master.put(annoying, new Object[]{par, "Balloon", naming, ratingType});

                                    int counter = k * 15;
                                    counter = counter + 839;
                                    counter++;
                                    String rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getBalloon_1();
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                    extratedData.get(counts).setBalloon_1("");

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getBalloon_2();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                        extratedData.get(counts).setBalloon_2("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getBalloon_3();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                        extratedData.get(counts).setBalloon_3("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getBalloon_4();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                        extratedData.get(counts).setBalloon_4("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getBalloon_5();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                        extratedData.get(counts).setBalloon_5("");
                                    }
                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getBalloon_6();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                        extratedData.get(counts).setBalloon_6("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getBalloon_7();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                        extratedData.get(counts).setBalloon_7("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getBalloon_8();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                        extratedData.get(counts).setBalloon_8("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getBalloon_9();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                        extratedData.get(counts).setBalloon_9("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getBalloon_10();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                        extratedData.get(counts).setBalloon_10("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getBalloon_11();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                        extratedData.get(counts).setBalloon_11("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getBalloon_12();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                        extratedData.get(counts).setBalloon_12("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getBalloon_13();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                        extratedData.get(counts).setBalloon_13("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getBalloon_14();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                        extratedData.get(counts).setBalloon_14("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getBalloon_15();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                        extratedData.get(counts).setBalloon_15("");
                                    }
                                    breakLoop = false;
                                }
                            }
                        }
                        counts++;
                    }
                }
                for(int k = 0; k < numLoop; k++) {
                    int counts = 1;
                    boolean breakLoop = true;
                    while (breakLoop) {
                        if (counts >= 577) {
                            breakLoop = false;
                            System.out.println("Not enough Soap in " + naming + ".xslx");
                        } else {
                            String temp = extratedData.get(counts).getSoap_1();
                            if ((temp != null)) {
                                if (!temp.equals("")) {
                                    String par = Integer.toString(counts);
                                    int rowNumberForMaster = (k + 62) + (j * 100);
                                    String annoying = Integer.toString(rowNumberForMaster);
                                    master.put(annoying, new Object[]{par, "Soap", naming, ratingType});

                                    int counter = k * 15;
                                    counter = counter + 989;
                                    counter++;
                                    String rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getSoap_1();
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                    extratedData.get(counts).setSoap_1("");

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getSoap_2();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                        extratedData.get(counts).setSoap_2("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getSoap_3();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                        extratedData.get(counts).setSoap_3("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getSoap_4();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                        extratedData.get(counts).setSoap_4("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getSoap_5();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                        extratedData.get(counts).setSoap_5("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getSoap_6();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                        extratedData.get(counts).setSoap_6("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getSoap_7();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                        extratedData.get(counts).setSoap_7("");
                                    }
                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getSoap_8();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                        extratedData.get(counts).setSoap_8("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getSoap_9();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                        extratedData.get(counts).setSoap_9("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getSoap_10();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                        extratedData.get(counts).setSoap_10("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getSoap_11();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                        extratedData.get(counts).setSoap_11("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getSoap_12();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                        extratedData.get(counts).setSoap_12("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getSoap_13();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                        extratedData.get(counts).setSoap_13("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getSoap_14();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                        extratedData.get(counts).setSoap_14("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getSoap_15();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                        extratedData.get(counts).setSoap_15("");
                                    }
                                    breakLoop = false;
                                }
                            }
                        }
                        counts++;
                    }
                }
                for(int k = 0; k < numLoop; k++) {
                    int counts = 1;
                    boolean breakLoop = true;
                    while (breakLoop) {
                        if (counts >= 577) {
                            breakLoop = false;
                            System.out.println("Not enough Stick in " + naming + ".xslx");
                        } else {
                            String temp = extratedData.get(counts).getStick_1();
                            if ((temp != null)) {
                                if (!temp.equals("")) {
                                    String par = Integer.toString(counts);
                                    int rowNumberForMaster = (k + 72) + (j * 100);
                                    String annoying = Integer.toString(rowNumberForMaster);
                                    master.put(annoying, new Object[]{par, "Stick", naming, ratingType});

                                    int counter = k * 15;
                                    counter = counter + 1139;
                                    counter++;
                                    String rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getStick_1();
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                    extratedData.get(counts).setStick_1("");

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getStick_2();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                        extratedData.get(counts).setStick_2("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getStick_3();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                        extratedData.get(counts).setStick_3("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getStick_4();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                        extratedData.get(counts).setStick_4("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getStick_5();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                        extratedData.get(counts).setStick_5("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getStick_6();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                        extratedData.get(counts).setStick_6("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getStick_7();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                        extratedData.get(counts).setStick_7("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getStick_8();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                        extratedData.get(counts).setStick_8("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getStick_9();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                        extratedData.get(counts).setStick_9("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getStick_10();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                        extratedData.get(counts).setStick_10("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getStick_11();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                        extratedData.get(counts).setStick_11("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getStick_12();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                        extratedData.get(counts).setStick_12("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getStick_13();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                        extratedData.get(counts).setStick_13("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getStick_14();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                        extratedData.get(counts).setStick_14("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getStick_15();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                        extratedData.get(counts).setStick_15("");
                                    }
                                    breakLoop = false;
                                }
                            }
                        }
                        counts++;
                    }
                }
                for(int k = 0; k < numLoop; k++) {
                    int counts = 1;
                    boolean breakLoop = true;
                    while (breakLoop) {
                        if (counts >= 577) {
                            breakLoop = false;
                            System.out.println("Not enough Rope in " + naming + ".xslx");
                        } else {
                            String temp = extratedData.get(counts).getRope_1();
                            if ((temp != null)) {
                                if (!temp.equals("")) {
                                    String par = Integer.toString(counts);
                                    int rowNumberForMaster = (k + 82) + (j * 100);
                                    String annoying = Integer.toString(rowNumberForMaster);
                                    master.put(annoying, new Object[]{par, "Rope", naming, ratingType});

                                    int counter = k * 15;
                                    counter = counter + 1289;
                                    counter++;
                                    String rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getRope_1();
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                    extratedData.get(counts).setRope_1("");

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getRope_2();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                        extratedData.get(counts).setRope_2("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getRope_3();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                        extratedData.get(counts).setRope_3("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getRope_4();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                        extratedData.get(counts).setRope_4("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getRope_5();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                        extratedData.get(counts).setRope_5("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getRope_6();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                        extratedData.get(counts).setRope_6("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getRope_7();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                        extratedData.get(counts).setRope_7("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getRope_8();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                        extratedData.get(counts).setRope_8("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getRope_9();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                        extratedData.get(counts).setRope_9("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getRope_10();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                        extratedData.get(counts).setRope_10("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getRope_11();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                        extratedData.get(counts).setRope_11("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getRope_12();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                        extratedData.get(counts).setRope_12("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getRope_13();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                        extratedData.get(counts).setRope_13("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getRope_14();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                        extratedData.get(counts).setRope_14("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getRope_15();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                        extratedData.get(counts).setRope_15("");
                                    }
                                    breakLoop = false;
                                }
                            }
                        }
                        counts++;
                    }
                }
                for(int k = 0; k < numLoop; k++) {
                    int counts = 1;
                    boolean breakLoop = true;
                    while (breakLoop) {
                        if (counts >= 577) {
                            breakLoop = false;
                            System.out.println("Not enough Marble in " + naming + ".xslx");
                        } else {
                            String temp = extratedData.get(counts).getMarble_1();
                            if ((temp != null)) {
                                if (!temp.equals("")) {
                                    String par = Integer.toString(counts);
                                    int rowNumberForMaster = (k + 92) + (j * 100);
                                    String annoying = Integer.toString(rowNumberForMaster);
                                    master.put(annoying, new Object[]{par, "Marble", naming, ratingType});

                                    int counter = k * 15;
                                    counter = counter + 1439;
                                    counter++;
                                    String rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getMarble_1();
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                    extratedData.get(counts).setMarble_1("");

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getMarble_2();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                        extratedData.get(counts).setMarble_2("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getMarble_3();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                        extratedData.get(counts).setMarble_3("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getMarble_4();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                        extratedData.get(counts).setMarble_4("");
                                    }
                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getMarble_5();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                        extratedData.get(counts).setMarble_5("");
                                    }
                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getMarble_6();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                        extratedData.get(counts).setMarble_6("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getMarble_7();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                        extratedData.get(counts).setMarble_7("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getMarble_8();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                        extratedData.get(counts).setMarble_8("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getMarble_9();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                        extratedData.get(counts).setMarble_9("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getMarble_10();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                        extratedData.get(counts).setMarble_10("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getMarble_11();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                        extratedData.get(counts).setMarble_11("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getMarble_12();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                        extratedData.get(counts).setMarble_12("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getMarble_13();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                        extratedData.get(counts).setMarble_13("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getMarble_14();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                        extratedData.get(counts).setMarble_14("");
                                    }

                                    counter++;
                                    rowNumber = Integer.toString(counter);
                                    temp = extratedData.get(counts).getMarble_15();
                                    if (!temp.equals("")) {
                                        snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                        extratedData.get(counts).setMarble_15("");
                                    }
                                    breakLoop = false;
                                }
                            }
                        }
                        counts++;
                    }
                }

                removeOtherSheets(sheetName, workbook);

                Set<String> keyset = snapshot.keySet();

                int rownum = 0;
                for (String key : keyset) {
                    //create a row of excelsheet
                    Row row = sheets.createRow(rownum++);

                    //get object array of prerticuler key
                    Object[] objArr = snapshot.get(key);

                    int cellnum = 0;

                    for (Object obj : objArr) {
                        Cell cell = row.createCell(cellnum++);
                        if (obj instanceof String) {
                            cell.setCellValue((String) obj);
                        } else if (obj instanceof Integer) {
                            cell.setCellValue((Integer) obj);
                        }
                    }

                    // .xlsx is the format for Excel Sheets...
                    // writing the workbook into the file...
                    FileOutputStream out = null;
                    try {
                        out = new FileOutputStream(new File("/Users/augustazukauskas/desktop/Files/Created Excel/" + naming + ".xlsx"));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    try {
                        workbook.write(out);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("Completed " + naming + ".xslx");
            } else {
                // 10 participants worth of data for item Pen
                for (int k = 0; k < numLoop; k++) {
                    boolean breakLoop = true;
                    while (breakLoop) {
                        int randompicker = picker.nextInt(577);
                        String temp = extratedData.get(randompicker).getPen_1();
                        if (temp != null) {
                            if (!temp.isEmpty()) {
                                String par = Integer.toString(randompicker);
                                int rowNumberForMaster = (k + 2) + (j * 100);
                                String annoying = Integer.toString(rowNumberForMaster);
                                master.put(annoying, new Object[]{par, "Pen", naming, ratingType});

                                int counter = k * 15;
                                counter = counter + 89;
                                counter++;
                                String rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getPen_1();
                                snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                // Once placed into new excel sheet, it gets 'deleted' so it will not be used again
                                extratedData.get(randompicker).setPen_1("");

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getPen_2();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                    extratedData.get(randompicker).setPen_2("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getPen_3();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                    extratedData.get(randompicker).setPen_3("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getPen_4();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                    extratedData.get(randompicker).setPen_4("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getPen_5();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                    extratedData.get(randompicker).setPen_5("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getPen_6();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                    extratedData.get(randompicker).setPen_6("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getPen_7();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                    extratedData.get(randompicker).setPen_7("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getPen_8();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                    extratedData.get(randompicker).setPen_8("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getPen_9();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                    extratedData.get(randompicker).setPen_9("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getPen_10();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                    extratedData.get(randompicker).setPen_10("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getPen_11();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                    extratedData.get(randompicker).setPen_11("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getPen_12();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                    extratedData.get(randompicker).setPen_12("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getPen_13();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                    extratedData.get(randompicker).setPen_13("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getPen_14();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                    extratedData.get(randompicker).setPen_14("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getPen_15();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Pen:", temp});
                                    extratedData.get(randompicker).setPen_15("");
                                }
                                breakLoop = false;
                            }
                        }
                    }
                }
                //10 participants worth of data for item Fork
                for (int k = 0; k < numLoop; k++) {
                    boolean breakLoop = true;
                    while (breakLoop) {
                        int randompicker = picker.nextInt(577);
                        String temp = extratedData.get(randompicker).getFork_1();
                        if ((temp != null)) {
                            if (!temp.equals("")) {
                                String par = Integer.toString(randompicker);
                                int rowNumberForMaster = (k + 12) + (j * 100);
                                String annoying = Integer.toString(rowNumberForMaster);
                                master.put(annoying, new Object[]{par, "Fork", naming, ratingType});

                                int counter = k * 15;
                                counter = counter + 239;
                                counter++;
                                String rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getFork_1();
                                snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                extratedData.get(randompicker).setFork_1("");

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getFork_2();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                    extratedData.get(randompicker).setFork_2("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getFork_3();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                    extratedData.get(randompicker).setFork_3("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getFork_4();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                    extratedData.get(randompicker).setFork_4("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getFork_5();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                    extratedData.get(randompicker).setFork_5("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getFork_6();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                    extratedData.get(randompicker).setFork_6("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getFork_7();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                    extratedData.get(randompicker).setFork_7("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getFork_8();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                    extratedData.get(randompicker).setFork_8("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getFork_9();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                    extratedData.get(randompicker).setFork_9("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getFork_10();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                    extratedData.get(randompicker).setFork_10("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getFork_11();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                    extratedData.get(randompicker).setFork_11("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getFork_12();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                    extratedData.get(randompicker).setFork_12("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getFork_13();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                    extratedData.get(randompicker).setFork_13("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getFork_14();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                    extratedData.get(randompicker).setFork_14("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getFork_15();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Fork:", temp});
                                    extratedData.get(randompicker).setFork_15("");
                                }
                                breakLoop = false;
                            }
                        }
                    }
                }
                // 10 participants worth of data for item Lamp
                for (int k = 0; k < numLoop; k++) {
                    boolean breakLoop = true;
                    while (breakLoop) {
                        int randompicker = picker.nextInt(577);
                        String temp = extratedData.get(randompicker).getLamp_1();
                        if ((temp != null)) {
                            if (!temp.equals("")) {
                                String par = Integer.toString(randompicker);
                                int rowNumberForMaster = (k + 22) + (j * 100);
                                String annoying = Integer.toString(rowNumberForMaster);
                                master.put(annoying, new Object[]{par, "Lamp", naming, ratingType});

                                int counter = k * 15;
                                counter = counter + 389;
                                counter++;
                                String rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLamp_1();
                                snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                extratedData.get(randompicker).setLamp_1("");

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLamp_2();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                    extratedData.get(randompicker).setLamp_2("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLamp_3();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                    extratedData.get(randompicker).setLamp_3("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLamp_4();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                    extratedData.get(randompicker).setLamp_4("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLamp_5();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                    extratedData.get(randompicker).setLamp_5("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLamp_6();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                    extratedData.get(randompicker).setLamp_6("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLamp_7();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                    extratedData.get(randompicker).setLamp_7("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLamp_8();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                    extratedData.get(randompicker).setLamp_8("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLamp_9();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                    extratedData.get(randompicker).setLamp_9("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLamp_10();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                    extratedData.get(randompicker).setLamp_10("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLamp_11();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                    extratedData.get(randompicker).setLamp_11("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLamp_12();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                    extratedData.get(randompicker).setLamp_12("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLamp_13();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                    extratedData.get(randompicker).setLamp_13("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLamp_14();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                    extratedData.get(randompicker).setLamp_14("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLamp_15();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lamp:", temp});
                                    extratedData.get(randompicker).setLamp_15("");
                                }
                                breakLoop = false;
                            }
                        }
                    }
                }
                // 10 participants worth of data for item Clock
                for (int k = 0; k < numLoop; k++) {
                    boolean breakLoop = true;
                    while (breakLoop) {
                        int randompicker = picker.nextInt(577);
                        String temp = extratedData.get(randompicker).getClock_1();
                        if ((temp != null)) {
                            if (!temp.equals("")) {
                                String par = Integer.toString(randompicker);
                                int rowNumberForMaster = (k + 32) + (j * 100);
                                String annoying = Integer.toString(rowNumberForMaster);
                                master.put(annoying, new Object[]{par, "Clock", naming, ratingType});

                                int counter = k * 15;
                                counter = counter + 539;
                                counter++;
                                String rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getClock_1();
                                snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                extratedData.get(randompicker).setClock_1("");

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getClock_2();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                    extratedData.get(randompicker).setClock_2("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getClock_3();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                    extratedData.get(randompicker).setClock_3("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getClock_4();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                    extratedData.get(randompicker).setClock_4("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getClock_5();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                    extratedData.get(randompicker).setClock_5("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getClock_6();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                    extratedData.get(randompicker).setClock_6("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getClock_7();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                    extratedData.get(randompicker).setClock_7("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getClock_8();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                    extratedData.get(randompicker).setClock_8("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getClock_9();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                    extratedData.get(randompicker).setClock_9("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getClock_10();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                    extratedData.get(randompicker).setClock_10("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getClock_11();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                    extratedData.get(randompicker).setClock_11("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getClock_12();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                    extratedData.get(randompicker).setClock_12("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getClock_13();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                    extratedData.get(randompicker).setClock_13("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getClock_14();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                    extratedData.get(randompicker).setClock_14("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getClock_15();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Clock:", temp});
                                    extratedData.get(randompicker).setClock_15("");
                                }
                                breakLoop = false;
                            }
                        }
                    }
                }
                //10 participants worth of data for item Lens
                for (int k = 0; k < numLoop; k++) {
                    boolean breakLoop = true;
                    while (breakLoop) {
                        int randompicker = picker.nextInt(577);
                        String temp = extratedData.get(randompicker).getLens_1();
                        if ((temp != null)) {
                            if (!temp.equals("")) {
                                String par = Integer.toString(randompicker);
                                int rowNumberForMaster = (k + 42) + (j * 100);
                                String annoying = Integer.toString(rowNumberForMaster);
                                master.put(annoying, new Object[]{par, "Lens", naming, ratingType});

                                int counter = k * 15;
                                counter = counter + 689;
                                counter++;
                                String rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLens_1();
                                snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                extratedData.get(randompicker).setLens_1("");

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLens_2();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                    extratedData.get(randompicker).setLens_2("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLens_3();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                    extratedData.get(randompicker).setLens_3("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLens_4();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                    extratedData.get(randompicker).setLens_4("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLens_5();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                    extratedData.get(randompicker).setLens_5("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLens_6();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                    extratedData.get(randompicker).setLens_6("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLens_7();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                    extratedData.get(randompicker).setLens_7("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLens_8();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                    extratedData.get(randompicker).setLens_8("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLens_9();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                    extratedData.get(randompicker).setLens_9("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLens_10();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                    extratedData.get(randompicker).setLens_10("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLens_11();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                    extratedData.get(randompicker).setLens_11("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLens_12();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                    extratedData.get(randompicker).setLens_12("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLens_13();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                    extratedData.get(randompicker).setLens_13("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLens_14();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                    extratedData.get(randompicker).setLens_14("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getLens_15();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Lens:", temp});
                                    extratedData.get(randompicker).setLens_15("");
                                }
                                breakLoop = false;
                            }
                        }
                    }
                }
                //10 participants worth of data for item Balloon
                for (int k = 0; k < numLoop; k++) {
                    boolean breakLoop = true;
                    while (breakLoop) {
                        int randompicker = picker.nextInt(577);
                        String temp = extratedData.get(randompicker).getBalloon_1();
                        if ((temp != null)) {
                            if (!temp.equals("")) {
                                String par = Integer.toString(randompicker);
                                int rowNumberForMaster = (k + 52) + (j * 100);
                                String annoying = Integer.toString(rowNumberForMaster);
                                master.put(annoying, new Object[]{par, "Balloon", naming, ratingType});

                                int counter = k * 15;
                                counter = counter + 839;
                                counter++;
                                String rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getBalloon_1();
                                snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                extratedData.get(randompicker).setBalloon_1("");

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getBalloon_2();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                    extratedData.get(randompicker).setBalloon_2("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getBalloon_3();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                    extratedData.get(randompicker).setBalloon_3("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getBalloon_4();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                    extratedData.get(randompicker).setBalloon_4("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getBalloon_5();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                    extratedData.get(randompicker).setBalloon_5("");
                                }
                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getBalloon_6();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                    extratedData.get(randompicker).setBalloon_6("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getBalloon_7();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                    extratedData.get(randompicker).setBalloon_7("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getBalloon_8();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                    extratedData.get(randompicker).setBalloon_8("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getBalloon_9();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                    extratedData.get(randompicker).setBalloon_9("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getBalloon_10();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                    extratedData.get(randompicker).setBalloon_10("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getBalloon_11();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                    extratedData.get(randompicker).setBalloon_11("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getBalloon_12();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                    extratedData.get(randompicker).setBalloon_12("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getBalloon_13();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                    extratedData.get(randompicker).setBalloon_13("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getBalloon_14();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                    extratedData.get(randompicker).setBalloon_14("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getBalloon_15();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Balloon:", temp});
                                    extratedData.get(randompicker).setBalloon_15("");
                                }
                                breakLoop = false;
                            }
                        }
                    }
                }
                // 10 participant worth of data for item Soap
                for (int k = 0; k < numLoop; k++) {
                    boolean breakLoop = true;
                    while (breakLoop) {
                        int randompicker = picker.nextInt(577);
                        String temp = extratedData.get(randompicker).getSoap_1();
                        if ((temp != null)) {
                            if (!temp.equals("")) {
                                String par = Integer.toString(randompicker);
                                int rowNumberForMaster = (k + 62) + (j * 100);
                                String annoying = Integer.toString(rowNumberForMaster);
                                master.put(annoying, new Object[]{par, "Soap", naming, ratingType});

                                int counter = k * 15;
                                counter = counter + 989;
                                counter++;
                                String rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getSoap_1();
                                snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                extratedData.get(randompicker).setSoap_1("");

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getSoap_2();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                    extratedData.get(randompicker).setSoap_2("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getSoap_3();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                    extratedData.get(randompicker).setSoap_3("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getSoap_4();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                    extratedData.get(randompicker).setSoap_4("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getSoap_5();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                    extratedData.get(randompicker).setSoap_5("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getSoap_6();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                    extratedData.get(randompicker).setSoap_6("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getSoap_7();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                    extratedData.get(randompicker).setSoap_7("");
                                }
                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getSoap_8();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                    extratedData.get(randompicker).setSoap_8("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getSoap_9();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                    extratedData.get(randompicker).setSoap_9("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getSoap_10();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                    extratedData.get(randompicker).setSoap_10("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getSoap_11();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                    extratedData.get(randompicker).setSoap_11("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getSoap_12();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                    extratedData.get(randompicker).setSoap_12("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getSoap_13();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                    extratedData.get(randompicker).setSoap_13("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getSoap_14();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                    extratedData.get(randompicker).setSoap_14("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getSoap_15();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Soap:", temp});
                                    extratedData.get(randompicker).setSoap_15("");
                                }
                                breakLoop = false;
                            }
                        }
                    }
                }
                // 10 participants worth of data for item Stick
                for (int k = 0; k < numLoop; k++) {
                    boolean breakLoop = true;
                    while (breakLoop) {
                        int randompicker = picker.nextInt(577);
                        String temp = extratedData.get(randompicker).getStick_1();
                        if ((temp != null)) {
                            if (!temp.equals("")) {
                                String par = Integer.toString(randompicker);
                                int rowNumberForMaster = (k + 72) + (j * 100);
                                String annoying = Integer.toString(rowNumberForMaster);
                                master.put(annoying, new Object[]{par, "Stick", naming, ratingType});

                                int counter = k * 15;
                                counter = counter + 1139;
                                counter++;
                                String rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getStick_1();
                                snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                extratedData.get(randompicker).setStick_1("");

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getStick_2();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                    extratedData.get(randompicker).setStick_2("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getStick_3();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                    extratedData.get(randompicker).setStick_3("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getStick_4();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                    extratedData.get(randompicker).setStick_4("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getStick_5();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                    extratedData.get(randompicker).setStick_5("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getStick_6();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                    extratedData.get(randompicker).setStick_6("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getStick_7();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                    extratedData.get(randompicker).setStick_7("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getStick_8();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                    extratedData.get(randompicker).setStick_8("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getStick_9();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                    extratedData.get(randompicker).setStick_9("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getStick_10();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                    extratedData.get(randompicker).setStick_10("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getStick_11();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                    extratedData.get(randompicker).setStick_11("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getStick_12();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                    extratedData.get(randompicker).setStick_12("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getStick_13();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                    extratedData.get(randompicker).setStick_13("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getStick_14();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                    extratedData.get(randompicker).setStick_14("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getStick_15();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Stick:", temp});
                                    extratedData.get(randompicker).setStick_15("");
                                }
                                breakLoop = false;
                            }
                        }
                    }
                }
                // 10 participants worth of data for item Rope
                for (int k = 0; k < numLoop; k++) {
                    boolean breakLoop = true;
                    while (breakLoop) {
                        int randompicker = picker.nextInt(577);
                        String temp = extratedData.get(randompicker).getRope_1();
                        if ((temp != null)) {
                            if (!temp.equals("")) {
                                String par = Integer.toString(randompicker);
                                int rowNumberForMaster = (k + 82) + (j * 100);
                                String annoying = Integer.toString(rowNumberForMaster);
                                master.put(annoying, new Object[]{par, "Rope", naming, ratingType});

                                int counter = k * 15;
                                counter = counter + 1289;
                                counter++;
                                String rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getRope_1();
                                snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                extratedData.get(randompicker).setRope_1("");

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getRope_2();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                    extratedData.get(randompicker).setRope_2("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getRope_3();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                    extratedData.get(randompicker).setRope_3("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getRope_4();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                    extratedData.get(randompicker).setRope_4("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getRope_5();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                    extratedData.get(randompicker).setRope_5("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getRope_6();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                    extratedData.get(randompicker).setRope_6("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getRope_7();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                    extratedData.get(randompicker).setRope_7("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getRope_8();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                    extratedData.get(randompicker).setRope_8("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getRope_9();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                    extratedData.get(randompicker).setRope_9("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getRope_10();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                    extratedData.get(randompicker).setRope_10("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getRope_11();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                    extratedData.get(randompicker).setRope_11("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getRope_12();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                    extratedData.get(randompicker).setRope_12("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getRope_13();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                    extratedData.get(randompicker).setRope_13("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getRope_14();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                    extratedData.get(randompicker).setRope_14("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getRope_15();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Rope:", temp});
                                    extratedData.get(randompicker).setRope_15("");
                                }
                                breakLoop = false;
                            }
                        }
                    }
                }
                // 10 participants worth of data for item Marble
                for (int k = 0; k < numLoop; k++) {
                    boolean breakLoop = true;
                    while (breakLoop) {
                        int randompicker = picker.nextInt(577);
                        String temp = extratedData.get(randompicker).getMarble_1();
                        if ((temp != null)) {
                            if (!temp.equals("")) {
                                String par = Integer.toString(randompicker);
                                int rowNumberForMaster = (k + 92) + (j * 100);
                                String annoying = Integer.toString(rowNumberForMaster);
                                master.put(annoying, new Object[]{par, "Marble", naming, ratingType});

                                int counter = k * 15;
                                counter = counter + 1439;
                                counter++;
                                String rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getMarble_1();
                                snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                extratedData.get(randompicker).setMarble_1("");

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getMarble_2();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                    extratedData.get(randompicker).setMarble_2("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getMarble_3();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                    extratedData.get(randompicker).setMarble_3("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getMarble_4();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                    extratedData.get(randompicker).setMarble_4("");
                                }
                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getMarble_5();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                    extratedData.get(randompicker).setMarble_5("");
                                }
                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getMarble_6();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                    extratedData.get(randompicker).setMarble_6("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getMarble_7();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                    extratedData.get(randompicker).setMarble_7("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getMarble_8();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                    extratedData.get(randompicker).setMarble_8("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getMarble_9();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                    extratedData.get(randompicker).setMarble_9("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getMarble_10();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                    extratedData.get(randompicker).setMarble_10("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getMarble_11();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                    extratedData.get(randompicker).setMarble_11("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getMarble_12();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                    extratedData.get(randompicker).setMarble_12("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getMarble_13();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                    extratedData.get(randompicker).setMarble_13("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getMarble_14();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                    extratedData.get(randompicker).setMarble_14("");
                                }

                                counter++;
                                rowNumber = Integer.toString(counter);
                                temp = extratedData.get(randompicker).getMarble_15();
                                if (!temp.equals("")) {
                                    snapshot.put(rowNumber, new Object[]{ratingType + " Rating of Marble:", temp});
                                    extratedData.get(randompicker).setMarble_15("");
                                }
                                breakLoop = false;
                            }
                        }
                    }
                }
                if(j>1){
                    removeOtherSheets(sheetName, workbook);
                }

                Set<String> keyset = snapshot.keySet();

                int rownum = 0;
                for (String key : keyset) {
                    //create a row of excelsheet
                    Row row = sheets.createRow(rownum++);

                    //get object array of prerticuler key
                    Object[] objArr = snapshot.get(key);

                    int cellnum = 0;

                    for (Object obj : objArr) {
                        Cell cell = row.createCell(cellnum++);
                        if (obj instanceof String) {
                            cell.setCellValue((String) obj);
                        } else if (obj instanceof Integer) {
                            cell.setCellValue((Integer) obj);
                        }
                    }

                    // .xlsx is the format for Excel Sheets...
                    // writing the workbook into the file...
                    FileOutputStream out = null;
                    try {
                        out = new FileOutputStream(new File("/Users/augustazukauskas/desktop/Files/Created Excel/" + naming + ".xlsx"));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    try {
                        workbook.write(out);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }


                System.out.println("Completed " + naming + ".xslx");
            }

        }
        XSSFSheet sheet = workbook.createSheet("sheet");

        Set<String> keyset = master.keySet();

        int rownum = 0;
        for (String key : keyset) {
            //create a row of excelsheet
            Row row = sheet.createRow(rownum++);

            //get object array of prerticuler key
            Object[] objArr = (Object[]) master.get(key);

            int cellnum = 0;

            for (Object obj : objArr) {
                Cell cell = row.createCell(cellnum++);
                if (obj instanceof String) {
                    cell.setCellValue((String) obj);
                } else if (obj instanceof Integer) {
                    cell.setCellValue((Integer) obj);
                }
            }
            // .xlsx is the format for Excel Sheets...
            // writing the workbook into the file...
            FileOutputStream out = null;
            try {
                out = new FileOutputStream(new File("/Users/augustazukauskas/desktop/Files/Created Excel/MasterSheet" + itNum + ".xlsx"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                workbook.write(out);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Created Master");
    }
    //Makes sure that there are not multiple sheets in the excel files
    // https://stackoverflow.com/questions/14951378/delete-an-excel-sheet-using-apache-poi
    private static void removeOtherSheets(String sheetName, XSSFWorkbook book) {
        for(int i=book.getNumberOfSheets()-1;i>=0;i--){
            XSSFSheet tmpSheet =book.getSheetAt(i);
            if(!tmpSheet.getSheetName().equals(sheetName)){
                book.removeSheetAt(i);
            }
        }
    }

    public static void main(String[] args) {
        GetContentFromExcelSheets getContentFromExcelSheets = new GetContentFromExcelSheets();

        // created 3 times snapshot
        List<OMCExcelDataVariables> extratedData = new ArrayList<OMCExcelDataVariables>();
        try {
            extratedData = getContentFromExcelSheets.readDataFromExcelFile("/Users/augustazukauskas/desktop/Files/OMC_Correlation_Study_F20-S21_April_20__Deidentified.xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<OMCExcelDataVariables> extratedData2 = new ArrayList<OMCExcelDataVariables>();
        try {
            extratedData2 = getContentFromExcelSheets.readDataFromExcelFile("/Users/augustazukauskas/desktop/Files/OMC_Correlation_Study_F20-S21_April_20__Deidentified.xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<OMCExcelDataVariables> extratedData3 = new ArrayList<OMCExcelDataVariables>();
        try {
            extratedData3 = getContentFromExcelSheets.readDataFromExcelFile("/Users/augustazukauskas/desktop/Files/OMC_Correlation_Study_F20-S21_April_20__Deidentified.xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<OMCExcelDataVariables> extratedData4 = new ArrayList<OMCExcelDataVariables>();
        try {
            extratedData4 = getContentFromExcelSheets.readDataFromExcelFile("/Users/augustazukauskas/desktop/Files/OMC_Correlation_Study_F20-S21_April_20__Deidentified.xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<OMCExcelDataVariables> extratedData5 = new ArrayList<OMCExcelDataVariables>();
        try {
            extratedData5 = getContentFromExcelSheets.readDataFromExcelFile("/Users/augustazukauskas/desktop/Files/OMC_Correlation_Study_F20-S21_April_20__Deidentified.xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<OMCExcelDataVariables> extratedData6 = new ArrayList<OMCExcelDataVariables>();
        try {
            extratedData6 = getContentFromExcelSheets.readDataFromExcelFile("/Users/augustazukauskas/desktop/Files/OMC_Correlation_Study_F20-S21_April_20__Deidentified.xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //creationOfExcel(extratedData, "Snapshot", 1, 10, 51);
        creationOfExcel(extratedData2, "Snapshot", 2, 10, 51);
        //creationOfExcel(extratedData3, "Snapshot", 3, 10, 51);
        creationOfExcel(extratedData4, "Top Two", 4, 8, 64);
        //creationOfExcel(extratedData5, "Top Two", 5, 8, 64);
        creationOfExcel(extratedData6, "Top Two", 6, 8, 64);

    }
}