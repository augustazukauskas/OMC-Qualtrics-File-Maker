import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OMCtoTxtV3 {

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

    public static class GetContentFromExcelSheets {
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

        public List<OMCtoTxt.OMCExcelDataVariables> readDataFromExcelFile(String excelFilePath)
                throws IOException {
            List<OMCtoTxt.OMCExcelDataVariables> listVariables = new ArrayList<OMCtoTxt.OMCExcelDataVariables>();

            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet firstSheet = workbook.getSheetAt(0);

            Iterator<Row> iterator = firstSheet.iterator();

            // installed a counter to count the number of participants from excel
            int counter = 1;

            while (iterator.hasNext()) {
                Row nextRow = iterator.next();

                Iterator<Cell> cellIterator = nextRow.cellIterator();
                OMCtoTxt.OMCExcelDataVariables omc = new OMCtoTxt.OMCExcelDataVariables();

                while (cellIterator.hasNext()) {
                    Cell nextCell = cellIterator.next();

                    int columnIndex = nextCell.getColumnIndex();
                    switch (columnIndex) {
                        case 0:
                            omc.setFinished(counter);
                            counter++;
                            break;

                        case 1:
                            omc.setPen_1((String) getCellValue(nextCell));
                            break;

                        case 2:
                            omc.setPen_2((String) getCellValue(nextCell));
                            break;

                        case 3:
                            omc.setPen_3((String) getCellValue(nextCell));
                            break;

                        case 4:
                            omc.setPen_4((String) getCellValue(nextCell));
                            break;

                        case 5:
                            omc.setPen_5((String) getCellValue(nextCell));
                            break;

                        case 6:
                            omc.setPen_6((String) getCellValue(nextCell));
                            break;

                        case 7:
                            omc.setPen_7((String) getCellValue(nextCell));
                            break;

                        case 8:
                            omc.setPen_8((String) getCellValue(nextCell));
                            break;

                        case 9:
                            omc.setPen_9((String) getCellValue(nextCell));
                            break;

                        case 10:
                            omc.setPen_10((String) getCellValue(nextCell));
                            break;

                        case 11:
                            omc.setPen_11((String) getCellValue(nextCell));
                            break;

                        case 12:
                            omc.setPen_12((String) getCellValue(nextCell));
                            break;

                        case 13:
                            omc.setPen_13((String) getCellValue(nextCell));
                            break;

                        case 14:
                            omc.setPen_14((String) getCellValue(nextCell));
                            break;

                        case 15:
                            omc.setPen_15((String) getCellValue(nextCell));
                            break;

                        case 16:
                            omc.setFork_1((String) getCellValue(nextCell));
                            break;

                        case 17:
                            omc.setFork_2((String) getCellValue(nextCell));
                            break;

                        case 18:
                            omc.setFork_3((String) getCellValue(nextCell));
                            break;

                        case 19:
                            omc.setFork_4((String) getCellValue(nextCell));
                            break;

                        case 20:
                            omc.setFork_5((String) getCellValue(nextCell));
                            break;

                        case 21:
                            omc.setFork_6((String) getCellValue(nextCell));
                            break;

                        case 22:
                            omc.setFork_7((String) getCellValue(nextCell));
                            break;

                        case 23:
                            omc.setFork_8((String) getCellValue(nextCell));
                            break;

                        case 24:
                            omc.setFork_9((String) getCellValue(nextCell));
                            break;

                        case 25:
                            omc.setFork_10((String) getCellValue(nextCell));
                            break;

                        case 26:
                            omc.setFork_11((String) getCellValue(nextCell));
                            break;

                        case 27:
                            omc.setFork_12((String) getCellValue(nextCell));
                            break;

                        case 28:
                            omc.setFork_13((String) getCellValue(nextCell));
                            break;

                        case 29:
                            omc.setFork_14((String) getCellValue(nextCell));
                            break;

                        case 30:
                            omc.setFork_15((String) getCellValue(nextCell));
                            break;

                        case 31:
                            omc.setLamp_1((String) getCellValue(nextCell));
                            break;

                        case 32:
                            omc.setLamp_2((String) getCellValue(nextCell));
                            break;

                        case 33:
                            omc.setLamp_3((String) getCellValue(nextCell));
                            break;

                        case 34:
                            omc.setLamp_4((String) getCellValue(nextCell));
                            break;

                        case 35:
                            omc.setLamp_5((String) getCellValue(nextCell));
                            break;

                        case 36:
                            omc.setLamp_6((String) getCellValue(nextCell));
                            break;

                        case 37:
                            omc.setLamp_7((String) getCellValue(nextCell));
                            break;

                        case 38:
                            omc.setLamp_8((String) getCellValue(nextCell));
                            break;

                        case 39:
                            omc.setLamp_9((String) getCellValue(nextCell));
                            break;

                        case 40:
                            omc.setLamp_10((String) getCellValue(nextCell));
                            break;

                        case 41:
                            omc.setLamp_11((String) getCellValue(nextCell));
                            break;

                        case 42:
                            omc.setLamp_12((String) getCellValue(nextCell));
                            break;

                        case 43:
                            omc.setLamp_13((String) getCellValue(nextCell));
                            break;

                        case 44:
                            omc.setLamp_14((String) getCellValue(nextCell));
                            break;

                        case 45:
                            omc.setLamp_15((String) getCellValue(nextCell));
                            break;

                        case 46:
                            omc.setClock_1((String) getCellValue(nextCell));
                            break;

                        case 47:
                            omc.setClock_2((String) getCellValue(nextCell));
                            break;

                        case 48:
                            omc.setClock_3((String) getCellValue(nextCell));
                            break;

                        case 49:
                            omc.setClock_4((String) getCellValue(nextCell));
                            break;

                        case 50:
                            omc.setClock_5((String) getCellValue(nextCell));
                            break;

                        case 51:
                            omc.setClock_6((String) getCellValue(nextCell));
                            break;

                        case 52:
                            omc.setClock_7((String) getCellValue(nextCell));
                            break;

                        case 53:
                            omc.setClock_8((String) getCellValue(nextCell));
                            break;

                        case 54:
                            omc.setClock_9((String) getCellValue(nextCell));
                            break;

                        case 55:
                            omc.setClock_10((String) getCellValue(nextCell));
                            break;

                        case 56:
                            omc.setClock_11((String) getCellValue(nextCell));
                            break;

                        case 57:
                            omc.setClock_12((String) getCellValue(nextCell));
                            break;

                        case 58:
                            omc.setClock_13((String) getCellValue(nextCell));
                            break;

                        case 59:
                            omc.setClock_14((String) getCellValue(nextCell));
                            break;

                        case 60:
                            omc.setClock_15((String) getCellValue(nextCell));
                            break;

                        case 61:
                            omc.setLens_1((String) getCellValue(nextCell));
                            break;

                        case 62:
                            omc.setLens_2((String) getCellValue(nextCell));
                            break;

                        case 63:
                            omc.setLens_3((String) getCellValue(nextCell));
                            break;

                        case 64:
                            omc.setLens_4((String) getCellValue(nextCell));
                            break;

                        case 65:
                            omc.setLens_5((String) getCellValue(nextCell));
                            break;

                        case 66:
                            omc.setLens_6((String) getCellValue(nextCell));
                            break;

                        case 67:
                            omc.setLens_7((String) getCellValue(nextCell));
                            break;

                        case 68:
                            omc.setLens_8((String) getCellValue(nextCell));
                            break;

                        case 69:
                            omc.setLens_9((String) getCellValue(nextCell));
                            break;

                        case 70:
                            omc.setLens_10((String) getCellValue(nextCell));
                            break;

                        case 71:
                            omc.setLens_11((String) getCellValue(nextCell));
                            break;

                        case 72:
                            omc.setLens_12((String) getCellValue(nextCell));
                            break;

                        case 73:
                            omc.setLens_13((String) getCellValue(nextCell));
                            break;

                        case 74:
                            omc.setLens_14((String) getCellValue(nextCell));
                            break;

                        case 75:
                            omc.setLens_15((String) getCellValue(nextCell));
                            break;

                        case 76:
                            omc.setBalloon_1((String) getCellValue(nextCell));
                            break;

                        case 77:
                            omc.setBalloon_2((String) getCellValue(nextCell));
                            break;

                        case 78:
                            omc.setBalloon_3((String) getCellValue(nextCell));
                            break;

                        case 79:
                            omc.setBalloon_4((String) getCellValue(nextCell));
                            break;

                        case 80:
                            omc.setBalloon_5((String) getCellValue(nextCell));
                            break;

                        case 81:
                            omc.setBalloon_6((String) getCellValue(nextCell));
                            break;

                        case 82:
                            omc.setBalloon_7((String) getCellValue(nextCell));
                            break;

                        case 83:
                            omc.setBalloon_8((String) getCellValue(nextCell));
                            break;

                        case 84:
                            omc.setBalloon_9((String) getCellValue(nextCell));
                            break;

                        case 85:
                            omc.setBalloon_10((String) getCellValue(nextCell));
                            break;

                        case 86:
                            omc.setBalloon_11((String) getCellValue(nextCell));
                            break;

                        case 87:
                            omc.setBalloon_12((String) getCellValue(nextCell));
                            break;

                        case 88:
                            omc.setBalloon_13((String) getCellValue(nextCell));
                            break;

                        case 89:
                            omc.setBalloon_14((String) getCellValue(nextCell));
                            break;

                        case 90:
                            omc.setBalloon_15((String) getCellValue(nextCell));
                            break;

                        case 91:
                            omc.setSoap_1((String) getCellValue(nextCell));
                            break;

                        case 92:
                            omc.setSoap_2((String) getCellValue(nextCell));
                            break;

                        case 93:
                            omc.setSoap_3((String) getCellValue(nextCell));
                            break;

                        case 94:
                            omc.setSoap_4((String) getCellValue(nextCell));
                            break;

                        case 95:
                            omc.setSoap_5((String) getCellValue(nextCell));
                            break;

                        case 96:
                            omc.setSoap_6((String) getCellValue(nextCell));
                            break;

                        case 97:
                            omc.setSoap_7((String) getCellValue(nextCell));
                            break;

                        case 98:
                            omc.setSoap_8((String) getCellValue(nextCell));
                            break;

                        case 99:
                            omc.setSoap_9((String) getCellValue(nextCell));
                            break;

                        case 100:
                            omc.setSoap_10((String) getCellValue(nextCell));
                            break;

                        case 101:
                            omc.setSoap_11((String) getCellValue(nextCell));
                            break;

                        case 102:
                            omc.setSoap_12((String) getCellValue(nextCell));
                            break;

                        case 103:
                            omc.setSoap_13((String) getCellValue(nextCell));
                            break;

                        case 104:
                            omc.setSoap_14((String) getCellValue(nextCell));
                            break;

                        case 105:
                            omc.setSoap_15((String) getCellValue(nextCell));
                            break;

                        case 106:
                            omc.setStick_1((String) getCellValue(nextCell));
                            break;

                        case 107:
                            omc.setStick_2((String) getCellValue(nextCell));
                            break;

                        case 108:
                            omc.setStick_3((String) getCellValue(nextCell));
                            break;

                        case 109:
                            omc.setStick_4((String) getCellValue(nextCell));
                            break;

                        case 110:
                            omc.setStick_5((String) getCellValue(nextCell));
                            break;

                        case 111:
                            omc.setStick_6((String) getCellValue(nextCell));
                            break;

                        case 112:
                            omc.setStick_7((String) getCellValue(nextCell));
                            break;

                        case 113:
                            omc.setStick_8((String) getCellValue(nextCell));
                            break;

                        case 114:
                            omc.setStick_9((String) getCellValue(nextCell));
                            break;

                        case 115:
                            omc.setStick_10((String) getCellValue(nextCell));
                            break;

                        case 116:
                            omc.setStick_11((String) getCellValue(nextCell));
                            break;

                        case 117:
                            omc.setStick_12((String) getCellValue(nextCell));
                            break;

                        case 118:
                            omc.setStick_13((String) getCellValue(nextCell));
                            break;

                        case 119:
                            omc.setStick_14((String) getCellValue(nextCell));
                            break;

                        case 120:
                            omc.setStick_15((String) getCellValue(nextCell));
                            break;

                        case 121:
                            omc.setRope_1((String) getCellValue(nextCell));
                            break;

                        case 122:
                            omc.setRope_2((String) getCellValue(nextCell));
                            break;

                        case 123:
                            omc.setRope_3((String) getCellValue(nextCell));
                            break;

                        case 124:
                            omc.setRope_4((String) getCellValue(nextCell));
                            break;

                        case 125:
                            omc.setRope_5((String) getCellValue(nextCell));
                            break;

                        case 126:
                            omc.setRope_6((String) getCellValue(nextCell));
                            break;

                        case 127:
                            omc.setRope_7((String) getCellValue(nextCell));
                            break;

                        case 128:
                            omc.setRope_8((String) getCellValue(nextCell));
                            break;

                        case 129:
                            omc.setRope_9((String) getCellValue(nextCell));
                            break;

                        case 130:
                            omc.setRope_10((String) getCellValue(nextCell));
                            break;

                        case 131:
                            omc.setRope_11((String) getCellValue(nextCell));
                            break;

                        case 132:
                            omc.setRope_12((String) getCellValue(nextCell));
                            break;

                        case 133:
                            omc.setRope_13((String) getCellValue(nextCell));
                            break;

                        case 134:
                            omc.setRope_14((String) getCellValue(nextCell));
                            break;

                        case 135:
                            omc.setRope_15((String) getCellValue(nextCell));
                            break;

                        case 136:
                            omc.setMarble_1((String) getCellValue(nextCell));
                            break;

                        case 137:
                            omc.setMarble_2((String) getCellValue(nextCell));
                            break;

                        case 138:
                            omc.setMarble_3((String) getCellValue(nextCell));
                            break;

                        case 139:
                            omc.setMarble_4((String) getCellValue(nextCell));
                            break;

                        case 140:
                            omc.setMarble_5((String) getCellValue(nextCell));
                            break;

                        case 141:
                            omc.setMarble_6((String) getCellValue(nextCell));
                            break;

                        case 142:
                            omc.setMarble_7((String) getCellValue(nextCell));
                            break;

                        case 143:
                            omc.setMarble_8((String) getCellValue(nextCell));
                            break;

                        case 144:
                            omc.setMarble_9((String) getCellValue(nextCell));
                            break;

                        case 145:
                            omc.setMarble_10((String) getCellValue(nextCell));
                            break;

                        case 146:
                            omc.setMarble_11((String) getCellValue(nextCell));
                            break;

                        case 147:
                            omc.setMarble_12((String) getCellValue(nextCell));
                            break;

                        case 148:
                            omc.setMarble_13((String) getCellValue(nextCell));
                            break;

                        case 149:
                            omc.setMarble_14((String) getCellValue(nextCell));
                            break;

                        case 150:
                            omc.setMarble_15((String) getCellValue(nextCell));
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

    public static void creatingSnapShotPen(List<OMCtoTxt.OMCExcelDataVariables> exractedData, FileWriter master) throws IOException {
        int picker = 0;
        int counter = 0;
        for (int j = 1; j <= 50; j++) {
            String fileName = "SnapShotPen_" + j;
            FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
            for (int k = 0; k < 10; k++) {
                boolean breakLoop = true;
                while (breakLoop) {
                    picker++;
                    String temp = exractedData.get(picker).getPen_1();
                    if (temp != null) {
                        if (!temp.isEmpty()) {
                            counter++;
                            String questionNumber = Integer.toString(counter);
                            master.write((picker + 1) + "\tPen\t" + "SnapShot: " + counter + "\n");
                            myWriter.write(questionNumber + ". Rate the overall creativity for the responses for Pen:\n");
                            myWriter.write(temp);
                            exractedData.get(picker).setPen_1("");

                            temp = exractedData.get(picker).getPen_2();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setPen_2("");
                            }

                            temp = exractedData.get(picker).getPen_3();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setPen_3("");
                            }

                            temp = exractedData.get(picker).getPen_4();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setPen_4("");
                            }

                            temp = exractedData.get(picker).getPen_5();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setPen_5("");
                            }

                            temp = exractedData.get(picker).getPen_6();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setPen_6("");
                            }

                            temp = exractedData.get(picker).getPen_7();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setPen_7("");
                            }

                            temp = exractedData.get(picker).getPen_8();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setPen_8("");
                            }

                            temp = exractedData.get(picker).getPen_9();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setPen_9("");
                            }

                            temp = exractedData.get(picker).getPen_10();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setPen_10("");
                            }

                            temp = exractedData.get(picker).getPen_11();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setPen_11("");
                            }

                            temp = exractedData.get(picker).getPen_12();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setPen_12("");
                            }

                            temp = exractedData.get(picker).getPen_13();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setPen_13("");
                            }

                            temp = exractedData.get(picker).getPen_14();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setPen_14("");
                            }

                            temp = exractedData.get(picker).getPen_15();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setPen_15("");
                            }
                            myWriter.write("\n\n1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                            myWriter.write("[[PageBreak]]\n\n");
                            breakLoop = false;
                        }
                    }
                }
            }
            myWriter.close();
        }
        String fileName = "SnapShotPen_51";
        FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
        for (int k = 0; k < 5; k++) {
            boolean breakLoop = true;
            while (breakLoop) {
                picker++;
                String temp = exractedData.get(picker).getPen_1();
                if (temp != null) {
                    if (!temp.isEmpty()) {
                        counter++;
                        String questionNumber = Integer.toString(counter);
                        master.write((picker + 1) + "\tPen\t" + "SnapShot: " + counter + "\n");
                        myWriter.write(questionNumber + ". Rate the overall creativity for the responses for Pen:\n");
                        myWriter.write(temp);
                        exractedData.get(picker).setPen_1("");

                        temp = exractedData.get(picker).getPen_2();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setPen_2("");
                        }

                        temp = exractedData.get(picker).getPen_3();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setPen_3("");
                        }

                        temp = exractedData.get(picker).getPen_4();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setPen_4("");
                        }

                        temp = exractedData.get(picker).getPen_5();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setPen_5("");
                        }

                        temp = exractedData.get(picker).getPen_6();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setPen_6("");
                        }

                        temp = exractedData.get(picker).getPen_7();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setPen_7("");
                        }

                        temp = exractedData.get(picker).getPen_8();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setPen_8("");
                        }

                        temp = exractedData.get(picker).getPen_9();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setPen_9("");
                        }

                        temp = exractedData.get(picker).getPen_10();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setPen_10("");
                        }

                        temp = exractedData.get(picker).getPen_11();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setPen_11("");
                        }

                        temp = exractedData.get(picker).getPen_12();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setPen_12("");
                        }

                        temp = exractedData.get(picker).getPen_13();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setPen_13("");
                        }

                        temp = exractedData.get(picker).getPen_14();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setPen_14("");
                        }

                        temp = exractedData.get(picker).getPen_15();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setPen_15("");
                        }
                        myWriter.write("\n\n1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                        myWriter.write("[[PageBreak]]\n\n");
                        breakLoop = false;
                    }
                }
            }
        }
        myWriter.close();
    }

    public static void creatingSnapShotFork(List<OMCtoTxt.OMCExcelDataVariables> exractedData, FileWriter master) throws IOException {
        int counter = 0;
        int picker = 0;
        for (int j = 1; j <= 50; j++) {
            String fileName = "SnapShotFork_" + j;
            FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
            for (int k = 0; k < 10; k++) {
                boolean breakLoop = true;
                while (breakLoop) {
                    picker++;
                    String temp = exractedData.get(picker).getFork_1();
                    if (temp != null) {
                        if (!temp.isEmpty()) {
                            counter++;
                            String questionNumber = Integer.toString(counter);
                            master.write((picker + 1) + "\tFork\t" + "SnapShot: " + counter + "\n");
                            myWriter.write(questionNumber + ". Rate the overall creativity for the responses for Fork:\n");
                            myWriter.write(temp);
                            exractedData.get(picker).setFork_1("");

                            temp = exractedData.get(picker).getFork_2();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setFork_2("");
                            }

                            temp = exractedData.get(picker).getFork_3();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setFork_3("");
                            }

                            temp = exractedData.get(picker).getFork_4();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setFork_4("");
                            }

                            temp = exractedData.get(picker).getFork_5();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setFork_5("");
                            }

                            temp = exractedData.get(picker).getFork_6();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setFork_6("");
                            }

                            temp = exractedData.get(picker).getFork_7();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setFork_7("");
                            }

                            temp = exractedData.get(picker).getFork_8();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setFork_8("");
                            }

                            temp = exractedData.get(picker).getFork_9();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setFork_9("");
                            }

                            temp = exractedData.get(picker).getFork_10();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setFork_10("");
                            }

                            temp = exractedData.get(picker).getFork_11();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setFork_11("");
                            }

                            temp = exractedData.get(picker).getFork_12();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setFork_12("");
                            }

                            temp = exractedData.get(picker).getFork_13();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setFork_13("");
                            }

                            temp = exractedData.get(picker).getFork_14();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setFork_14("");
                            }

                            temp = exractedData.get(picker).getFork_15();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setFork_15("");
                            }
                            myWriter.write("\n\n1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                            myWriter.write("[[PageBreak]]\n\n");
                            breakLoop = false;
                        }
                    }
                }
            }
            myWriter.close();
        }
        String fileName = "SnapShotFork_51";
        FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
        for (int k = 0; k < 6; k++) {
            boolean breakLoop = true;
            while (breakLoop) {
                picker++;
                String temp = exractedData.get(picker).getFork_1();
                if (temp != null) {
                    if (!temp.isEmpty()) {
                        counter++;
                        String questionNumber = Integer.toString(counter);
                        master.write((picker + 1) + "\tFork\t" + "SnapShot: " + counter + "\n");
                        myWriter.write(questionNumber + ". Rate the overall creativity for the responses for Fork:\n");
                        myWriter.write(temp);
                        exractedData.get(picker).setFork_1("");

                        temp = exractedData.get(picker).getFork_2();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setFork_2("");
                        }

                        temp = exractedData.get(picker).getFork_3();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setFork_3("");
                        }

                        temp = exractedData.get(picker).getFork_4();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setFork_4("");
                        }

                        temp = exractedData.get(picker).getFork_5();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setFork_5("");
                        }

                        temp = exractedData.get(picker).getFork_6();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setFork_6("");
                        }

                        temp = exractedData.get(picker).getFork_7();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setFork_7("");
                        }

                        temp = exractedData.get(picker).getFork_8();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setFork_8("");
                        }

                        temp = exractedData.get(picker).getFork_9();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setFork_9("");
                        }

                        temp = exractedData.get(picker).getFork_10();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setFork_10("");
                        }

                        temp = exractedData.get(picker).getFork_11();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setFork_11("");
                        }

                        temp = exractedData.get(picker).getFork_12();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setFork_12("");
                        }

                        temp = exractedData.get(picker).getFork_13();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setFork_13("");
                        }

                        temp = exractedData.get(picker).getFork_14();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setFork_14("");
                        }

                        temp = exractedData.get(picker).getFork_15();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setFork_15("");
                        }
                        myWriter.write("\n\n1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                        myWriter.write("[[PageBreak]]\n\n");
                        breakLoop = false;
                    }
                }
            }
        }
        myWriter.close();
    }

    public static void creatingSnapShotLamp(List<OMCtoTxt.OMCExcelDataVariables> exractedData, FileWriter master) throws IOException {
        int counter = 0;
        int picker = 0;
        for (int j = 1; j <= 49; j++) {
            String fileName = "SnapShotLamp_" + j;
            FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
            for (int k = 0; k < 10; k++) {
                boolean breakLoop = true;
                while (breakLoop) {
                    picker++;
                    String temp = exractedData.get(picker).getLamp_1();
                    if (temp != null) {
                        if (!temp.isEmpty()) {
                            counter++;
                            String questionNumber = Integer.toString(counter);
                            master.write((picker + 1) + "\tLamp\t" + "SnapShot: " + counter + "\n");
                            myWriter.write(questionNumber + ". Rate the overall creativity for the responses for Lamp:\n");
                            myWriter.write(temp);
                            exractedData.get(picker).setLamp_1("");

                            temp = exractedData.get(picker).getLamp_2();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLamp_2("");
                            }

                            temp = exractedData.get(picker).getLamp_3();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLamp_3("");
                            }

                            temp = exractedData.get(picker).getLamp_4();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLamp_4("");
                            }

                            temp = exractedData.get(picker).getLamp_5();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLamp_5("");
                            }

                            temp = exractedData.get(picker).getLamp_6();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLamp_6("");
                            }

                            temp = exractedData.get(picker).getLamp_7();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLamp_7("");
                            }

                            temp = exractedData.get(picker).getLamp_8();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLamp_8("");
                            }

                            temp = exractedData.get(picker).getLamp_9();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLamp_9("");
                            }

                            temp = exractedData.get(picker).getLamp_10();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLamp_10("");
                            }

                            temp = exractedData.get(picker).getLamp_11();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLamp_11("");
                            }

                            temp = exractedData.get(picker).getLamp_12();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLamp_12("");
                            }

                            temp = exractedData.get(picker).getLamp_13();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLamp_13("");
                            }

                            temp = exractedData.get(picker).getLamp_14();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLamp_14("");
                            }

                            temp = exractedData.get(picker).getLamp_15();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLamp_15("");
                            }
                            myWriter.write("\n\n1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                            myWriter.write("[[PageBreak]]\n\n");
                            breakLoop = false;
                        }
                    }
                }
            }
            myWriter.close();
        }
        String fileName = "SnapShotLamp_50";
        FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
        boolean breakLoop = true;
        while (breakLoop) {
            picker++;
            String temp = exractedData.get(picker).getLamp_1();
            if (temp != null) {
                if (!temp.isEmpty()) {
                    counter++;
                    String questionNumber = Integer.toString(counter);
                    master.write((picker + 1) + "\tLamp\t" + "SnapShot: " + counter + "\n");
                    myWriter.write(questionNumber + ". Rate the overall creativity for the responses for Lamp:\n");
                    myWriter.write(temp);
                    exractedData.get(picker).setLamp_1("");

                    temp = exractedData.get(picker).getLamp_2();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLamp_2("");
                    }

                    temp = exractedData.get(picker).getLamp_3();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLamp_3("");
                    }

                    temp = exractedData.get(picker).getLamp_4();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLamp_4("");
                    }

                    temp = exractedData.get(picker).getLamp_5();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLamp_5("");
                    }

                    temp = exractedData.get(picker).getLamp_6();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLamp_6("");
                    }

                    temp = exractedData.get(picker).getLamp_7();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLamp_7("");
                    }

                    temp = exractedData.get(picker).getLamp_8();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLamp_8("");
                    }

                    temp = exractedData.get(picker).getLamp_9();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLamp_9("");
                    }

                    temp = exractedData.get(picker).getLamp_10();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLamp_10("");
                    }

                    temp = exractedData.get(picker).getLamp_11();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLamp_11("");
                    }

                    temp = exractedData.get(picker).getLamp_12();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLamp_12("");
                    }

                    temp = exractedData.get(picker).getLamp_13();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLamp_13("");
                    }

                    temp = exractedData.get(picker).getLamp_14();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLamp_14("");
                    }

                    temp = exractedData.get(picker).getLamp_15();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLamp_15("");
                    }
                    myWriter.write("\n\n1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                    myWriter.write("[[PageBreak]]\n\n");
                    breakLoop = false;
                }
            }
        }
        myWriter.close();
    }

    public static void creatingSnapShotClock(List<OMCtoTxt.OMCExcelDataVariables> exractedData, FileWriter master) throws IOException {
        int counter = 0;
        int picker = 0;
        for (int j = 1; j <= 49; j++) {
            String fileName = "SnapShotClock_" + j;
            FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
            for (int k = 0; k < 10; k++) {
                boolean breakLoop = true;
                while (breakLoop) {
                    picker++;
                    String temp = exractedData.get(picker).getClock_1();
                    if (temp != null) {
                        if (!temp.isEmpty()) {
                            counter++;
                            String questionNumber = Integer.toString(counter);
                            master.write((picker + 1) + "\tClock\t" + "SnapShot: " + counter + "\n");
                            myWriter.write(questionNumber + ". Rate the overall creativity for the responses for Clock:\n");
                            myWriter.write(temp);
                            exractedData.get(picker).setClock_1("");

                            temp = exractedData.get(picker).getClock_2();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setClock_2("");
                            }

                            temp = exractedData.get(picker).getClock_3();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setClock_3("");
                            }

                            temp = exractedData.get(picker).getClock_4();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setClock_4("");
                            }

                            temp = exractedData.get(picker).getClock_5();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setClock_5("");
                            }

                            temp = exractedData.get(picker).getClock_6();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setClock_6("");
                            }

                            temp = exractedData.get(picker).getClock_7();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setClock_7("");
                            }

                            temp = exractedData.get(picker).getClock_8();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setClock_8("");
                            }

                            temp = exractedData.get(picker).getClock_9();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setClock_9("");
                            }

                            temp = exractedData.get(picker).getClock_10();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setClock_10("");
                            }

                            temp = exractedData.get(picker).getClock_11();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setClock_11("");
                            }

                            temp = exractedData.get(picker).getClock_12();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setClock_12("");
                            }

                            temp = exractedData.get(picker).getClock_13();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setClock_13("");
                            }

                            temp = exractedData.get(picker).getClock_14();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setClock_14("");
                            }

                            temp = exractedData.get(picker).getClock_15();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setClock_15("");
                            }
                            myWriter.write("\n\n1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                            myWriter.write("[[PageBreak]]\n\n");
                            breakLoop = false;
                        }
                    }
                }
            }
            myWriter.close();
        }
        String fileName = "SnapShotClock_50";
        FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
        for (int j = 0; j < 2; j++) {
            boolean breakLoop = true;
            while (breakLoop) {
                picker++;
                String temp = exractedData.get(picker).getClock_1();
                if (temp != null) {
                    if (!temp.isEmpty()) {
                        counter++;
                        String questionNumber = Integer.toString(counter);
                        master.write((picker + 1) + "\tClock\t" + "SnapShot: " + counter + "\n");
                        myWriter.write(questionNumber + ". Rate the overall creativity for the responses for Clock:\n");
                        myWriter.write(temp);
                        exractedData.get(picker).setClock_1("");

                        temp = exractedData.get(picker).getClock_2();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setClock_2("");
                        }

                        temp = exractedData.get(picker).getClock_3();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setClock_3("");
                        }

                        temp = exractedData.get(picker).getClock_4();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setClock_4("");
                        }

                        temp = exractedData.get(picker).getClock_5();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setClock_5("");
                        }

                        temp = exractedData.get(picker).getClock_6();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setClock_6("");
                        }

                        temp = exractedData.get(picker).getClock_7();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setClock_7("");
                        }

                        temp = exractedData.get(picker).getClock_8();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setClock_8("");
                        }

                        temp = exractedData.get(picker).getClock_9();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setClock_9("");
                        }

                        temp = exractedData.get(picker).getClock_10();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setClock_10("");
                        }

                        temp = exractedData.get(picker).getClock_11();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setClock_11("");
                        }

                        temp = exractedData.get(picker).getClock_12();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setClock_12("");
                        }

                        temp = exractedData.get(picker).getClock_13();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setClock_13("");
                        }

                        temp = exractedData.get(picker).getClock_14();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setClock_14("");
                        }

                        temp = exractedData.get(picker).getClock_15();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setClock_15("");
                        }
                        myWriter.write("\n\n1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                        myWriter.write("[[PageBreak]]\n\n");
                        breakLoop = false;
                    }
                }
            }
        }
        myWriter.close();
    }

    public static void creatingSnapShotLens(List<OMCtoTxt.OMCExcelDataVariables> exractedData, FileWriter master) throws IOException {
        int counter = 0;
        int picker = 0;
        for (int j = 1; j <= 49; j++) {
            String fileName = "SnapShotLens_" + j;
            FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
            for (int k = 0; k < 10; k++) {
                boolean breakLoop = true;
                while (breakLoop) {
                    picker++;
                    String temp = exractedData.get(picker).getLens_1();
                    if (temp != null) {
                        if (!temp.isEmpty()) {
                            counter++;
                            String questionNumber = Integer.toString(counter);
                            master.write((picker + 1) + "\tLens\t" + "SnapShot: " + counter + "\n");
                            myWriter.write(questionNumber + ". Rate the overall creativity for the responses for Lens:\n");
                            myWriter.write(temp);
                            exractedData.get(picker).setLens_1("");

                            temp = exractedData.get(picker).getLens_2();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLens_2("");
                            }

                            temp = exractedData.get(picker).getLens_3();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLens_3("");
                            }

                            temp = exractedData.get(picker).getLens_4();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLens_4("");
                            }

                            temp = exractedData.get(picker).getLens_5();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLens_5("");
                            }

                            temp = exractedData.get(picker).getLens_6();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLens_6("");
                            }

                            temp = exractedData.get(picker).getLens_7();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLens_7("");
                            }

                            temp = exractedData.get(picker).getLens_8();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLens_8("");
                            }

                            temp = exractedData.get(picker).getLens_9();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLens_9("");
                            }

                            temp = exractedData.get(picker).getLens_10();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLens_10("");
                            }

                            temp = exractedData.get(picker).getLens_11();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLens_11("");
                            }

                            temp = exractedData.get(picker).getLens_12();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLens_12("");
                            }

                            temp = exractedData.get(picker).getLens_13();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLens_13("");
                            }

                            temp = exractedData.get(picker).getLens_14();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLens_14("");
                            }

                            temp = exractedData.get(picker).getLens_15();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setLens_15("");
                            }
                            myWriter.write("\n\n1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                            myWriter.write("[[PageBreak]]\n\n");
                            breakLoop = false;
                        }
                    }
                }
            }
            myWriter.close();
        }
        String fileName = "SnapShotLens_50";
        FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
        boolean breakLoop = true;
        while (breakLoop) {
            picker++;
            String temp = exractedData.get(picker).getLens_1();
            if (temp != null) {
                if (!temp.isEmpty()) {
                    counter++;
                    String questionNumber = Integer.toString(counter);
                    master.write((picker + 1) + "\tLens\t" + "SnapShot: " + counter + "\n");
                    myWriter.write(questionNumber + ". Rate the overall creativity for the responses for Lens:\n");
                    myWriter.write(temp);
                    exractedData.get(picker).setLens_1("");

                    temp = exractedData.get(picker).getLens_2();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLens_2("");
                    }

                    temp = exractedData.get(picker).getLens_3();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLens_3("");
                    }

                    temp = exractedData.get(picker).getLens_4();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLens_4("");
                    }

                    temp = exractedData.get(picker).getLens_5();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLens_5("");
                    }

                    temp = exractedData.get(picker).getLens_6();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLens_6("");
                    }

                    temp = exractedData.get(picker).getLens_7();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLens_7("");
                    }

                    temp = exractedData.get(picker).getLens_8();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLens_8("");
                    }

                    temp = exractedData.get(picker).getLens_9();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLens_9("");
                    }

                    temp = exractedData.get(picker).getLens_10();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLens_10("");
                    }

                    temp = exractedData.get(picker).getLens_11();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLens_11("");
                    }

                    temp = exractedData.get(picker).getLens_12();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLens_12("");
                    }

                    temp = exractedData.get(picker).getLens_13();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLens_13("");
                    }

                    temp = exractedData.get(picker).getLens_14();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLens_14("");
                    }

                    temp = exractedData.get(picker).getLens_15();
                    if (!temp.equals("")) {
                        myWriter.write(", " + temp);
                        exractedData.get(picker).setLens_15("");
                    }
                    myWriter.write("\n\n1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                    myWriter.write("[[PageBreak]]\n\n");
                    breakLoop = false;
                }
            }
        }
        myWriter.close();
    }

    public static void creatingSnapShotBalloon(List<OMCtoTxt.OMCExcelDataVariables> exractedData, FileWriter master) throws IOException {
        int counter = 0;
        int picker = 0;
        for (int j = 1; j <= 50; j++) {
            String fileName = "SnapShotBalloon_" + j;
            FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
            for (int k = 0; k < 10; k++) {
                boolean breakLoop = true;
                while (breakLoop) {
                    picker++;
                    String temp = exractedData.get(picker).getBalloon_1();
                    if (temp != null) {
                        if (!temp.isEmpty()) {
                            counter++;
                            String questionNumber = Integer.toString(counter);
                            master.write((picker + 1) + "\tBalloon\t" + "SnapShot: " + counter + "\n");
                            myWriter.write(questionNumber + ". Rate the overall creativity for the responses for Balloon:\n");
                            myWriter.write(temp);
                            exractedData.get(picker).setBalloon_1("");

                            temp = exractedData.get(picker).getBalloon_2();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setBalloon_2("");
                            }

                            temp = exractedData.get(picker).getBalloon_3();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setBalloon_3("");
                            }

                            temp = exractedData.get(picker).getBalloon_4();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setBalloon_4("");
                            }

                            temp = exractedData.get(picker).getBalloon_5();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setBalloon_5("");
                            }

                            temp = exractedData.get(picker).getBalloon_6();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setBalloon_6("");
                            }

                            temp = exractedData.get(picker).getBalloon_7();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setBalloon_7("");
                            }

                            temp = exractedData.get(picker).getBalloon_8();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setBalloon_8("");
                            }

                            temp = exractedData.get(picker).getBalloon_9();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setBalloon_9("");
                            }

                            temp = exractedData.get(picker).getBalloon_10();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setBalloon_10("");
                            }

                            temp = exractedData.get(picker).getBalloon_11();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setBalloon_11("");
                            }

                            temp = exractedData.get(picker).getBalloon_12();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setBalloon_12("");
                            }

                            temp = exractedData.get(picker).getBalloon_13();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setBalloon_13("");
                            }

                            temp = exractedData.get(picker).getBalloon_14();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setBalloon_14("");
                            }

                            temp = exractedData.get(picker).getBalloon_15();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setBalloon_15("");
                            }
                            myWriter.write("\n\n1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                            myWriter.write("[[PageBreak]]\n\n");
                            breakLoop = false;
                        }
                    }
                }
            }
            myWriter.close();
        }
        String fileName = "SnapShotBalloon_51";
        FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
        for (int j = 0; j < 4; j++) {
            boolean breakLoop = true;
            while (breakLoop) {
                picker++;
                String temp = exractedData.get(picker).getBalloon_1();
                if (temp != null) {
                    if (!temp.isEmpty()) {
                        counter++;
                        String questionNumber = Integer.toString(counter);
                        master.write((picker + 1) + "\tBalloon\t" + "SnapShot: " + counter + "\n");
                        myWriter.write(questionNumber + ". Rate the overall creativity for the responses for Balloon:\n");
                        myWriter.write(temp);
                        exractedData.get(picker).setBalloon_1("");

                        temp = exractedData.get(picker).getBalloon_2();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setBalloon_2("");
                        }

                        temp = exractedData.get(picker).getBalloon_3();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setBalloon_3("");
                        }

                        temp = exractedData.get(picker).getBalloon_4();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setBalloon_4("");
                        }

                        temp = exractedData.get(picker).getBalloon_5();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setBalloon_5("");
                        }

                        temp = exractedData.get(picker).getBalloon_6();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setBalloon_6("");
                        }

                        temp = exractedData.get(picker).getBalloon_7();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setBalloon_7("");
                        }

                        temp = exractedData.get(picker).getBalloon_8();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setBalloon_8("");
                        }

                        temp = exractedData.get(picker).getBalloon_9();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setBalloon_9("");
                        }

                        temp = exractedData.get(picker).getBalloon_10();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setBalloon_10("");
                        }

                        temp = exractedData.get(picker).getBalloon_11();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setBalloon_11("");
                        }

                        temp = exractedData.get(picker).getBalloon_12();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setBalloon_12("");
                        }

                        temp = exractedData.get(picker).getBalloon_13();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setBalloon_13("");
                        }

                        temp = exractedData.get(picker).getBalloon_14();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setBalloon_14("");
                        }

                        temp = exractedData.get(picker).getBalloon_15();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setBalloon_15("");
                        }
                        myWriter.write("\n\n1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                        myWriter.write("[[PageBreak]]\n\n");
                        breakLoop = false;
                    }
                }
            }
        }
        myWriter.close();
    }

    public static void creatingSnapShotSoap(List<OMCtoTxt.OMCExcelDataVariables> exractedData, FileWriter master) throws IOException {
        int counter = 0;
        int picker = 0;
        for (int j = 1; j <= 50; j++) {
            String fileName = "SnapShotSoap_" + j;
            FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
            for (int k = 0; k < 10; k++) {
                boolean breakLoop = true;
                while (breakLoop) {
                    picker++;
                    String temp = exractedData.get(picker).getSoap_1();
                    if (temp != null) {
                        if (!temp.isEmpty()) {
                            counter++;
                            String questionNumber = Integer.toString(counter);
                            master.write((picker + 1) + "\tSoap\t" + "SnapShot: " + counter + "\n");
                            myWriter.write(questionNumber + ". Rate the overall creativity for the responses for Soap:\n");
                            myWriter.write(temp);
                            exractedData.get(picker).setSoap_1("");

                            temp = exractedData.get(picker).getSoap_2();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setSoap_2("");
                            }

                            temp = exractedData.get(picker).getSoap_3();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setSoap_3("");
                            }

                            temp = exractedData.get(picker).getSoap_4();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setSoap_4("");
                            }

                            temp = exractedData.get(picker).getSoap_5();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setSoap_5("");
                            }

                            temp = exractedData.get(picker).getSoap_6();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setSoap_6("");
                            }

                            temp = exractedData.get(picker).getSoap_7();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setSoap_7("");
                            }

                            temp = exractedData.get(picker).getSoap_8();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setSoap_8("");
                            }

                            temp = exractedData.get(picker).getSoap_9();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setSoap_9("");
                            }

                            temp = exractedData.get(picker).getSoap_10();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setSoap_10("");
                            }

                            temp = exractedData.get(picker).getSoap_11();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setSoap_11("");
                            }

                            temp = exractedData.get(picker).getSoap_12();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setSoap_12("");
                            }

                            temp = exractedData.get(picker).getSoap_13();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setSoap_13("");
                            }

                            temp = exractedData.get(picker).getSoap_14();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setSoap_14("");
                            }

                            temp = exractedData.get(picker).getSoap_15();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setSoap_15("");
                            }
                            myWriter.write("\n\n1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                            myWriter.write("[[PageBreak]]\n\n");
                            breakLoop = false;
                        }
                    }
                }
            }
            myWriter.close();
        }
        String fileName = "SnapShotSoap_51";
        FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
        for (int j = 0; j < 2; j++) {
            boolean breakLoop = true;
            while (breakLoop) {
                picker++;
                String temp = exractedData.get(picker).getSoap_1();
                if (temp != null) {
                    if (!temp.isEmpty()) {
                        counter++;
                        String questionNumber = Integer.toString(counter);
                        master.write((picker + 1) + "\tSoap\t" + "SnapShot: " + counter + "\n");
                        myWriter.write(questionNumber + ". Rate the overall creativity for the responses for Soap:\n");
                        myWriter.write(temp);
                        exractedData.get(picker).setSoap_1("");

                        temp = exractedData.get(picker).getSoap_2();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setSoap_2("");
                        }

                        temp = exractedData.get(picker).getSoap_3();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setSoap_3("");
                        }

                        temp = exractedData.get(picker).getSoap_4();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setSoap_4("");
                        }

                        temp = exractedData.get(picker).getSoap_5();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setSoap_5("");
                        }

                        temp = exractedData.get(picker).getSoap_6();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setSoap_6("");
                        }

                        temp = exractedData.get(picker).getSoap_7();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setSoap_7("");
                        }

                        temp = exractedData.get(picker).getSoap_8();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setSoap_8("");
                        }

                        temp = exractedData.get(picker).getSoap_9();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setSoap_9("");
                        }

                        temp = exractedData.get(picker).getSoap_10();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setSoap_10("");
                        }

                        temp = exractedData.get(picker).getSoap_11();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setSoap_11("");
                        }

                        temp = exractedData.get(picker).getSoap_12();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setSoap_12("");
                        }

                        temp = exractedData.get(picker).getSoap_13();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setSoap_13("");
                        }

                        temp = exractedData.get(picker).getSoap_14();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setSoap_14("");
                        }

                        temp = exractedData.get(picker).getSoap_15();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setSoap_15("");
                        }
                        myWriter.write("\n\n1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                        myWriter.write("[[PageBreak]]\n\n");
                        breakLoop = false;
                    }
                }
            }
        }
        myWriter.close();
    }

    public static void creatingSnapShotStick(List<OMCtoTxt.OMCExcelDataVariables> exractedData, FileWriter master) throws IOException {
        int counter = 0;
        int picker = 0;
        for (int j = 1; j <= 50; j++) {
            String fileName = "SnapShotStick_" + j;
            FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
            for (int k = 0; k < 10; k++) {
                boolean breakLoop = true;
                while (breakLoop) {
                    picker++;
                    String temp = exractedData.get(picker).getStick_1();
                    if (temp != null) {
                        if (!temp.isEmpty()) {
                            counter++;
                            String questionNumber = Integer.toString(counter);
                            master.write((picker + 1) + "\tStick\t" + "SnapShot: " + counter + "\n");
                            myWriter.write(questionNumber + ". Rate the overall creativity for the responses for Stick:\n");
                            myWriter.write(temp);
                            exractedData.get(picker).setStick_1("");

                            temp = exractedData.get(picker).getStick_2();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setStick_2("");
                            }

                            temp = exractedData.get(picker).getStick_3();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setStick_3("");
                            }

                            temp = exractedData.get(picker).getStick_4();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setStick_4("");
                            }

                            temp = exractedData.get(picker).getStick_5();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setStick_5("");
                            }

                            temp = exractedData.get(picker).getStick_6();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setStick_6("");
                            }

                            temp = exractedData.get(picker).getStick_7();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setStick_7("");
                            }

                            temp = exractedData.get(picker).getStick_8();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setStick_8("");
                            }

                            temp = exractedData.get(picker).getStick_9();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setStick_9("");
                            }

                            temp = exractedData.get(picker).getStick_10();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setStick_10("");
                            }

                            temp = exractedData.get(picker).getStick_11();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setStick_11("");
                            }

                            temp = exractedData.get(picker).getStick_12();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setStick_12("");
                            }

                            temp = exractedData.get(picker).getStick_13();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setStick_13("");
                            }

                            temp = exractedData.get(picker).getStick_14();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setStick_14("");
                            }

                            temp = exractedData.get(picker).getStick_15();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setStick_15("");
                            }
                            myWriter.write("\n\n1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                            myWriter.write("[[PageBreak]]\n\n");
                            breakLoop = false;
                        }
                    }
                }
            }
            myWriter.close();
        }
        String fileName = "SnapShotStick_51";
        FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
        for (int j = 0; j < 9; j++) {
            boolean breakLoop = true;
            while (breakLoop) {
                picker++;
                String temp = exractedData.get(picker).getStick_1();
                if (temp != null) {
                    if (!temp.isEmpty()) {
                        counter++;
                        String questionNumber = Integer.toString(counter);
                        master.write((picker + 1) + "\tStick\t" + "SnapShot: " + counter + "\n");
                        myWriter.write(questionNumber + ". Rate the overall creativity for the responses for Stick:\n");
                        myWriter.write(temp);
                        exractedData.get(picker).setStick_1("");

                        temp = exractedData.get(picker).getStick_2();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setStick_2("");
                        }

                        temp = exractedData.get(picker).getStick_3();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setStick_3("");
                        }

                        temp = exractedData.get(picker).getStick_4();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setStick_4("");
                        }

                        temp = exractedData.get(picker).getStick_5();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setStick_5("");
                        }

                        temp = exractedData.get(picker).getStick_6();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setStick_6("");
                        }

                        temp = exractedData.get(picker).getStick_7();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setStick_7("");
                        }

                        temp = exractedData.get(picker).getStick_8();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setStick_8("");
                        }

                        temp = exractedData.get(picker).getStick_9();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setStick_9("");
                        }

                        temp = exractedData.get(picker).getStick_10();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setStick_10("");
                        }

                        temp = exractedData.get(picker).getStick_11();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setStick_11("");
                        }

                        temp = exractedData.get(picker).getStick_12();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setStick_12("");
                        }

                        temp = exractedData.get(picker).getStick_13();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setStick_13("");
                        }

                        temp = exractedData.get(picker).getStick_14();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setStick_14("");
                        }

                        temp = exractedData.get(picker).getStick_15();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setStick_15("");
                        }
                        myWriter.write("\n\n1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                        myWriter.write("[[PageBreak]]\n\n");
                        breakLoop = false;
                    }
                }
            }
        }
        myWriter.close();
    }

    public static void creatingSnapShotRope(List<OMCtoTxt.OMCExcelDataVariables> exractedData, FileWriter master) throws IOException {
        int counter = 0;
        int picker = 0;
        for (int j = 1; j <= 50; j++) {
            String fileName = "SnapShotRope_" + j;
            FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
            for (int k = 0; k < 10; k++) {
                boolean breakLoop = true;
                while (breakLoop) {
                    picker++;
                    String temp = exractedData.get(picker).getRope_1();
                    if (temp != null) {
                        if (!temp.isEmpty()) {
                            counter++;
                            String questionNumber = Integer.toString(counter);
                            master.write((picker + 1) + "\tRope\t" + "SnapShot: " + counter + "\n");
                            myWriter.write(questionNumber + ". Rate the overall creativity for the responses for Rope:\n");
                            myWriter.write(temp);
                            exractedData.get(picker).setRope_1("");

                            temp = exractedData.get(picker).getRope_2();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setRope_2("");
                            }

                            temp = exractedData.get(picker).getRope_3();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setRope_3("");
                            }

                            temp = exractedData.get(picker).getRope_4();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setRope_4("");
                            }

                            temp = exractedData.get(picker).getRope_5();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setRope_5("");
                            }

                            temp = exractedData.get(picker).getRope_6();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setRope_6("");
                            }

                            temp = exractedData.get(picker).getRope_7();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setRope_7("");
                            }

                            temp = exractedData.get(picker).getRope_8();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setRope_8("");
                            }

                            temp = exractedData.get(picker).getRope_9();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setRope_9("");
                            }

                            temp = exractedData.get(picker).getRope_10();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setRope_10("");
                            }

                            temp = exractedData.get(picker).getRope_11();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setRope_11("");
                            }

                            temp = exractedData.get(picker).getRope_12();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setRope_12("");
                            }

                            temp = exractedData.get(picker).getRope_13();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setRope_13("");
                            }

                            temp = exractedData.get(picker).getRope_14();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setRope_14("");
                            }

                            temp = exractedData.get(picker).getRope_15();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setRope_15("");
                            }
                            myWriter.write("\n\n1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                            myWriter.write("[[PageBreak]]\n\n");
                            breakLoop = false;
                        }
                    }
                }
            }
            myWriter.close();
        }
        String fileName = "SnapShotRope_51";
        FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
        for (int j = 0; j < 2; j++) {
            boolean breakLoop = true;
            while (breakLoop) {
                picker++;
                String temp = exractedData.get(picker).getRope_1();
                if (temp != null) {
                    if (!temp.isEmpty()) {
                        counter++;
                        String questionNumber = Integer.toString(counter);
                        master.write((picker + 1) + "\tRope\t" + "SnapShot: " + counter + "\n");
                        myWriter.write(questionNumber + ". Rate the overall creativity for the responses for Rope:\n");
                        myWriter.write(temp);
                        exractedData.get(picker).setRope_1("");

                        temp = exractedData.get(picker).getRope_2();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setRope_2("");
                        }

                        temp = exractedData.get(picker).getRope_3();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setRope_3("");
                        }

                        temp = exractedData.get(picker).getRope_4();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setRope_4("");
                        }

                        temp = exractedData.get(picker).getRope_5();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setRope_5("");
                        }

                        temp = exractedData.get(picker).getRope_6();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setRope_6("");
                        }

                        temp = exractedData.get(picker).getRope_7();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setRope_7("");
                        }

                        temp = exractedData.get(picker).getRope_8();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setRope_8("");
                        }

                        temp = exractedData.get(picker).getRope_9();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setRope_9("");
                        }

                        temp = exractedData.get(picker).getRope_10();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setRope_10("");
                        }

                        temp = exractedData.get(picker).getRope_11();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setRope_11("");
                        }

                        temp = exractedData.get(picker).getRope_12();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setRope_12("");
                        }

                        temp = exractedData.get(picker).getRope_13();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setRope_13("");
                        }

                        temp = exractedData.get(picker).getRope_14();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setRope_14("");
                        }

                        temp = exractedData.get(picker).getRope_15();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setRope_15("");
                        }
                        myWriter.write("\n\n1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                        myWriter.write("[[PageBreak]]\n\n");
                        breakLoop = false;
                    }
                }
            }
        }
        myWriter.close();
    }

    public static void creatingSnapShotMarble(List<OMCtoTxt.OMCExcelDataVariables> exractedData, FileWriter master) throws IOException {
        int counter = 0;
        int picker = 0;
        for (int j = 1; j <= 49; j++) {
            String fileName = "SnapShotMarble_" + j;
            FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
            for (int k = 0; k < 10; k++) {
                boolean breakLoop = true;
                while (breakLoop) {
                    picker++;
                    String temp = exractedData.get(picker).getMarble_1();
                    if (temp != null) {
                        if (!temp.isEmpty()) {
                            counter++;
                            String questionNumber = Integer.toString(counter);
                            master.write((picker + 1) + "\tMarble\t" + "SnapShot: " + counter + "\n");
                            myWriter.write(questionNumber + ". Rate the overall creativity for the responses for Marble:\n");
                            myWriter.write(temp);
                            exractedData.get(picker).setMarble_1("");

                            temp = exractedData.get(picker).getMarble_2();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setMarble_2("");
                            }

                            temp = exractedData.get(picker).getMarble_3();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setMarble_3("");
                            }

                            temp = exractedData.get(picker).getMarble_4();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setMarble_4("");
                            }

                            temp = exractedData.get(picker).getMarble_5();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setMarble_5("");
                            }

                            temp = exractedData.get(picker).getMarble_6();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setMarble_6("");
                            }

                            temp = exractedData.get(picker).getMarble_7();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setMarble_7("");
                            }

                            temp = exractedData.get(picker).getMarble_8();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setMarble_8("");
                            }

                            temp = exractedData.get(picker).getMarble_9();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setMarble_9("");
                            }

                            temp = exractedData.get(picker).getMarble_10();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setMarble_10("");
                            }

                            temp = exractedData.get(picker).getMarble_11();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setMarble_11("");
                            }

                            temp = exractedData.get(picker).getMarble_12();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setMarble_12("");
                            }

                            temp = exractedData.get(picker).getMarble_13();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setMarble_13("");
                            }

                            temp = exractedData.get(picker).getMarble_14();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setMarble_14("");
                            }

                            temp = exractedData.get(picker).getMarble_15();
                            if (!temp.equals("")) {
                                myWriter.write(", " + temp);
                                exractedData.get(picker).setMarble_15("");
                            }
                            myWriter.write("\n\n1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                            myWriter.write("[[PageBreak]]\n\n");
                            breakLoop = false;
                        }
                    }
                }
            }
            myWriter.close();
        }
        String fileName = "SnapShotMarble_50";
        FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
        for (int j = 0; j < 7; j++) {
            boolean breakLoop = true;
            while (breakLoop) {
                picker++;
                String temp = exractedData.get(picker).getMarble_1();
                if (temp != null) {
                    if (!temp.isEmpty()) {
                        counter++;
                        String questionNumber = Integer.toString(counter);
                        master.write((picker + 1) + "\tMarble\t" + "SnapShot: " + counter + "\n");
                        myWriter.write(questionNumber + ". Rate the overall creativity for the responses for Marble:\n");
                        myWriter.write(temp);
                        exractedData.get(picker).setMarble_1("");

                        temp = exractedData.get(picker).getMarble_2();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setMarble_2("");
                        }

                        temp = exractedData.get(picker).getMarble_3();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setMarble_3("");
                        }

                        temp = exractedData.get(picker).getMarble_4();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setMarble_4("");
                        }

                        temp = exractedData.get(picker).getMarble_5();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setMarble_5("");
                        }

                        temp = exractedData.get(picker).getMarble_6();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setMarble_6("");
                        }

                        temp = exractedData.get(picker).getMarble_7();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setMarble_7("");
                        }

                        temp = exractedData.get(picker).getMarble_8();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setMarble_8("");
                        }

                        temp = exractedData.get(picker).getMarble_9();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setMarble_9("");
                        }

                        temp = exractedData.get(picker).getMarble_10();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setMarble_10("");
                        }

                        temp = exractedData.get(picker).getMarble_11();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setMarble_11("");
                        }

                        temp = exractedData.get(picker).getMarble_12();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setMarble_12("");
                        }

                        temp = exractedData.get(picker).getMarble_13();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setMarble_13("");
                        }

                        temp = exractedData.get(picker).getMarble_14();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setMarble_14("");
                        }

                        temp = exractedData.get(picker).getMarble_15();
                        if (!temp.equals("")) {
                            myWriter.write(", " + temp);
                            exractedData.get(picker).setMarble_15("");
                        }
                        myWriter.write("\n\n1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                        myWriter.write("[[PageBreak]]\n\n");
                        breakLoop = false;
                    }
                }
            }
        }
        myWriter.close();
    }

    public static void creatingTopTwoPen(List<OMCtoTxt.OMCExcelDataVariables> exractedData, FileWriter master) throws IOException {
        int counter = 0;
        int picker = 0;
        for (int j = 1; j <= 50; j++) {
            String fileName = "TopTwoPen_" + j;
            FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
            for (int k = 0; k < 10; k++) {
                boolean breakLoop = true;
                while (breakLoop) {
                    picker++;
                    String temp = exractedData.get(picker).getPen_1();
                    if (temp != null) {
                        if (!temp.isEmpty()) {
                            counter++;
                            String questionNumber = Integer.toString(counter);
                            master.write((picker + 1) + "\tPen\t" + "TopTwo: " + counter + "\n");
                            myWriter.write(questionNumber + ". Pick the top two creative responses for Pen:\n[[MultipleAnswer]]\n\n");
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setPen_1("");

                            temp = exractedData.get(picker).getPen_2();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setPen_2("");
                            }

                            temp = exractedData.get(picker).getPen_3();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setPen_3("");
                            }

                            temp = exractedData.get(picker).getPen_4();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setPen_4("");
                            }

                            temp = exractedData.get(picker).getPen_5();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setPen_5("");
                            }

                            temp = exractedData.get(picker).getPen_6();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setPen_6("");
                            }

                            temp = exractedData.get(picker).getPen_7();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setPen_7("");
                            }

                            temp = exractedData.get(picker).getPen_8();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setPen_8("");
                            }

                            temp = exractedData.get(picker).getPen_9();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setPen_9("");
                            }

                            temp = exractedData.get(picker).getPen_10();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setPen_10("");
                            }

                            temp = exractedData.get(picker).getPen_11();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setPen_11("");
                            }

                            temp = exractedData.get(picker).getPen_12();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setPen_12("");
                            }

                            temp = exractedData.get(picker).getPen_13();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setPen_13("");
                            }

                            temp = exractedData.get(picker).getPen_14();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setPen_14("");
                            }

                            temp = exractedData.get(picker).getPen_15();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setPen_15("");
                            }
                            myWriter.write("\n");
                            counter++;
                            questionNumber = Integer.toString(counter);
                            myWriter.write(questionNumber + ". Rate the creativity of the the two creative responses:\n\n");
                            myWriter.write("1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                            myWriter.write("[[PageBreak]]\n\n");
                            breakLoop = false;
                        }
                    }
                }
            }
            myWriter.close();
        }
        String fileName = "TopTwoPen_51";
        FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
        for (int k = 0; k < 5; k++) {
            boolean breakLoop = true;
            while (breakLoop) {
                picker++;
                String temp = exractedData.get(picker).getPen_1();
                if (temp != null) {
                    if (!temp.isEmpty()) {
                        counter++;
                        String questionNumber = Integer.toString(counter);
                        master.write((picker + 1) + "\tPen\t" + "TopTwo: " + counter + "\n");
                        myWriter.write(questionNumber + ". Pick the top two creative responses for Pen:\n[[MultipleAnswer]]\n\n");
                        myWriter.write(temp + "\n");
                        exractedData.get(picker).setPen_1("");

                        temp = exractedData.get(picker).getPen_2();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setPen_2("");
                        }

                        temp = exractedData.get(picker).getPen_3();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setPen_3("");
                        }

                        temp = exractedData.get(picker).getPen_4();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setPen_4("");
                        }

                        temp = exractedData.get(picker).getPen_5();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setPen_5("");
                        }

                        temp = exractedData.get(picker).getPen_6();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setPen_6("");
                        }

                        temp = exractedData.get(picker).getPen_7();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setPen_7("");
                        }

                        temp = exractedData.get(picker).getPen_8();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setPen_8("");
                        }

                        temp = exractedData.get(picker).getPen_9();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setPen_9("");
                        }

                        temp = exractedData.get(picker).getPen_10();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setPen_10("");
                        }

                        temp = exractedData.get(picker).getPen_11();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setPen_11("");
                        }

                        temp = exractedData.get(picker).getPen_12();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setPen_12("");
                        }

                        temp = exractedData.get(picker).getPen_13();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setPen_13("");
                        }

                        temp = exractedData.get(picker).getPen_14();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setPen_14("");
                        }

                        temp = exractedData.get(picker).getPen_15();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setPen_15("");
                        }
                        myWriter.write("\n");
                        counter++;
                        questionNumber = Integer.toString(counter);
                        myWriter.write(questionNumber + ". Rate the creativity of the the two creative responses:\n\n");
                        myWriter.write("1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                        myWriter.write("[[PageBreak]]\n\n");
                        breakLoop = false;
                    }
                }
            }
        }
        myWriter.close();
    }

    public static void creatingTopTwoFork(List<OMCtoTxt.OMCExcelDataVariables> exractedData, FileWriter master) throws IOException {
        int counter = 0;
        int picker = 0;
        for (int j = 1; j <= 50; j++) {
            String fileName = "TopTwoFork_" + j;
            FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
            for (int k = 0; k < 10; k++) {
                boolean breakLoop = true;
                while (breakLoop) {
                    picker++;
                    String temp = exractedData.get(picker).getFork_1();
                    if (temp != null) {
                        if (!temp.isEmpty()) {
                            counter++;
                            String questionNumber = Integer.toString(counter);
                            master.write((picker + 1) + "\tFork\t" + "TopTwo: " + counter + "\n");
                            myWriter.write(questionNumber + ". Pick the top two creative responses for Fork:\n[[MultipleAnswer]]\n\n");
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setFork_1("");

                            temp = exractedData.get(picker).getFork_2();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setFork_2("");
                            }

                            temp = exractedData.get(picker).getFork_3();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setFork_3("");
                            }

                            temp = exractedData.get(picker).getFork_4();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setFork_4("");
                            }

                            temp = exractedData.get(picker).getFork_5();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setFork_5("");
                            }

                            temp = exractedData.get(picker).getFork_6();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setFork_6("");
                            }

                            temp = exractedData.get(picker).getFork_7();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setFork_7("");
                            }

                            temp = exractedData.get(picker).getFork_8();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setFork_8("");
                            }

                            temp = exractedData.get(picker).getFork_9();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setFork_9("");
                            }

                            temp = exractedData.get(picker).getFork_10();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setFork_10("");
                            }

                            temp = exractedData.get(picker).getFork_11();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setFork_11("");
                            }

                            temp = exractedData.get(picker).getFork_12();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setFork_12("");
                            }

                            temp = exractedData.get(picker).getFork_13();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setFork_13("");
                            }

                            temp = exractedData.get(picker).getFork_14();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setFork_14("");
                            }

                            temp = exractedData.get(picker).getFork_15();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setFork_15("");
                            }
                            myWriter.write("\n");
                            counter++;
                            questionNumber = Integer.toString(counter);
                            myWriter.write(questionNumber + ". Rate the creativity of the the two creative responses:\n\n");
                            myWriter.write("1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                            myWriter.write("[[PageBreak]]\n\n");
                            breakLoop = false;
                        }
                    }
                }
            }
            myWriter.close();
        }
        String fileName = "TopTwoFork_51";
        FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
        for (int k = 0; k < 6; k++) {
            boolean breakLoop = true;
            while (breakLoop) {
                picker++;
                String temp = exractedData.get(picker).getFork_1();
                if (temp != null) {
                    if (!temp.isEmpty()) {
                        counter++;
                        String questionNumber = Integer.toString(counter);
                        master.write((picker + 1) + "\tFork\t" + "TopTwo: " + counter + "\n");
                        myWriter.write(questionNumber + ". Pick the top two creative responses for Fork:\n[[MultipleAnswer]]\n\n");
                        myWriter.write(temp + "\n");
                        exractedData.get(picker).setFork_1("");

                        temp = exractedData.get(picker).getFork_2();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setFork_2("");
                        }

                        temp = exractedData.get(picker).getFork_3();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setFork_3("");
                        }

                        temp = exractedData.get(picker).getFork_4();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setFork_4("");
                        }

                        temp = exractedData.get(picker).getFork_5();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setFork_5("");
                        }

                        temp = exractedData.get(picker).getFork_6();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setFork_6("");
                        }

                        temp = exractedData.get(picker).getFork_7();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setFork_7("");
                        }

                        temp = exractedData.get(picker).getFork_8();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setFork_8("");
                        }

                        temp = exractedData.get(picker).getFork_9();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setFork_9("");
                        }

                        temp = exractedData.get(picker).getFork_10();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setFork_10("");
                        }

                        temp = exractedData.get(picker).getFork_11();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setFork_11("");
                        }

                        temp = exractedData.get(picker).getFork_12();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setFork_12("");
                        }

                        temp = exractedData.get(picker).getFork_13();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setFork_13("");
                        }

                        temp = exractedData.get(picker).getFork_14();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setFork_14("");
                        }

                        temp = exractedData.get(picker).getFork_15();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setFork_15("");
                        }
                        myWriter.write("\n");
                        counter++;
                        questionNumber = Integer.toString(counter);
                        myWriter.write(questionNumber + ". Rate the creativity of the the two creative responses:\n\n");
                        myWriter.write("1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                        myWriter.write("[[PageBreak]]\n\n");
                        breakLoop = false;
                    }
                }
            }
        }
        myWriter.close();
    }

    public static void creatingTopTwoLamp(List<OMCtoTxt.OMCExcelDataVariables> exractedData, FileWriter master) throws IOException {
        int counter = 0;
        int picker = 0;
        for (int j = 1; j <= 49; j++) {
            String fileName = "TopTwoLamp_" + j;
            FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
            for (int k = 0; k < 10; k++) {
                boolean breakLoop = true;
                while (breakLoop) {
                    picker++;
                    String temp = exractedData.get(picker).getLamp_1();
                    if (temp != null) {
                        if (!temp.isEmpty()) {
                            counter++;
                            String questionNumber = Integer.toString(counter);
                            master.write((picker + 1) + "\tLamp\t" + "TopTwo: " + counter + "\n");
                            myWriter.write(questionNumber + ". Pick the top two creative responses for Lamp:\n[[MultipleAnswer]]\n\n");
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLamp_1("");

                            temp = exractedData.get(picker).getLamp_2();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLamp_2("");
                            }

                            temp = exractedData.get(picker).getLamp_3();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLamp_3("");
                            }

                            temp = exractedData.get(picker).getLamp_4();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLamp_4("");
                            }

                            temp = exractedData.get(picker).getLamp_5();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLamp_5("");
                            }

                            temp = exractedData.get(picker).getLamp_6();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLamp_6("");
                            }

                            temp = exractedData.get(picker).getLamp_7();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLamp_7("");
                            }

                            temp = exractedData.get(picker).getLamp_8();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLamp_8("");
                            }

                            temp = exractedData.get(picker).getLamp_9();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLamp_9("");
                            }

                            temp = exractedData.get(picker).getLamp_10();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLamp_10("");
                            }

                            temp = exractedData.get(picker).getLamp_11();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLamp_11("");
                            }

                            temp = exractedData.get(picker).getLamp_12();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLamp_12("");
                            }

                            temp = exractedData.get(picker).getLamp_13();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLamp_13("");
                            }

                            temp = exractedData.get(picker).getLamp_14();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLamp_14("");
                            }

                            temp = exractedData.get(picker).getLamp_15();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLamp_15("");
                            }
                            myWriter.write("\n");
                            counter++;
                            questionNumber = Integer.toString(counter);
                            myWriter.write(questionNumber + ". Rate the creativity of the the two creative responses:\n\n");
                            myWriter.write("1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                            myWriter.write("[[PageBreak]]\n\n");
                            breakLoop = false;
                        }
                    }
                }
            }
            myWriter.close();
        }
        String fileName = "TopTwoLamp_50";
        FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
        for (int k = 0; k < 1; k++) {
            boolean breakLoop = true;
            while (breakLoop) {
                picker++;
                String temp = exractedData.get(picker).getLamp_1();
                if (temp != null) {
                    if (!temp.isEmpty()) {
                        counter++;
                        String questionNumber = Integer.toString(counter);
                        master.write((picker + 1) + "\tLamp\t" + "TopTwo: " + counter + "\n");
                        myWriter.write(questionNumber + ". Pick the top two creative responses for Lamp:\n[[MultipleAnswer]]\n\n");
                        myWriter.write(temp + "\n");
                        exractedData.get(picker).setLamp_1("");

                        temp = exractedData.get(picker).getLamp_2();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLamp_2("");
                        }

                        temp = exractedData.get(picker).getLamp_3();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLamp_3("");
                        }

                        temp = exractedData.get(picker).getLamp_4();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLamp_4("");
                        }

                        temp = exractedData.get(picker).getLamp_5();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLamp_5("");
                        }

                        temp = exractedData.get(picker).getLamp_6();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLamp_6("");
                        }

                        temp = exractedData.get(picker).getLamp_7();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLamp_7("");
                        }

                        temp = exractedData.get(picker).getLamp_8();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLamp_8("");
                        }

                        temp = exractedData.get(picker).getLamp_9();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLamp_9("");
                        }

                        temp = exractedData.get(picker).getLamp_10();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLamp_10("");
                        }

                        temp = exractedData.get(picker).getLamp_11();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLamp_11("");
                        }

                        temp = exractedData.get(picker).getLamp_12();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLamp_12("");
                        }

                        temp = exractedData.get(picker).getLamp_13();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLamp_13("");
                        }

                        temp = exractedData.get(picker).getLamp_14();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLamp_14("");
                        }

                        temp = exractedData.get(picker).getLamp_15();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLamp_15("");
                        }
                        myWriter.write("\n");
                        counter++;
                        questionNumber = Integer.toString(counter);
                        myWriter.write(questionNumber + ". Rate the creativity of the the two creative responses:\n\n");
                        myWriter.write("1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                        myWriter.write("[[PageBreak]]\n\n");
                        breakLoop = false;
                    }
                }
            }
        }
        myWriter.close();
    }

    public static void creatingTopTwoClock(List<OMCtoTxt.OMCExcelDataVariables> exractedData, FileWriter master) throws IOException {
        int counter = 0;
        int picker = 0;
        for (int j = 1; j <= 49; j++) {
            String fileName = "TopTwoClock_" + j;
            FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
            for (int k = 0; k < 10; k++) {
                boolean breakLoop = true;
                while (breakLoop) {
                    picker++;
                    String temp = exractedData.get(picker).getClock_1();
                    if (temp != null) {
                        if (!temp.isEmpty()) {
                            counter++;
                            String questionNumber = Integer.toString(counter);
                            master.write((picker + 1) + "\tClock\t" + "TopTwo: " + counter + "\n");
                            myWriter.write(questionNumber + ". Pick the top two creative responses for Clock:\n[[MultipleAnswer]]\n\n");
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setClock_1("");

                            temp = exractedData.get(picker).getClock_2();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setClock_2("");
                            }

                            temp = exractedData.get(picker).getClock_3();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setClock_3("");
                            }

                            temp = exractedData.get(picker).getClock_4();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setClock_4("");
                            }

                            temp = exractedData.get(picker).getClock_5();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setClock_5("");
                            }

                            temp = exractedData.get(picker).getClock_6();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setClock_6("");
                            }

                            temp = exractedData.get(picker).getClock_7();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setClock_7("");
                            }

                            temp = exractedData.get(picker).getClock_8();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setClock_8("");
                            }

                            temp = exractedData.get(picker).getClock_9();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setClock_9("");
                            }

                            temp = exractedData.get(picker).getClock_10();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setClock_10("");
                            }

                            temp = exractedData.get(picker).getClock_11();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setClock_11("");
                            }

                            temp = exractedData.get(picker).getClock_12();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setClock_12("");
                            }

                            temp = exractedData.get(picker).getClock_13();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setClock_13("");
                            }

                            temp = exractedData.get(picker).getClock_14();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setClock_14("");
                            }

                            temp = exractedData.get(picker).getClock_15();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setClock_15("");
                            }
                            myWriter.write("\n");
                            counter++;
                            questionNumber = Integer.toString(counter);
                            myWriter.write(questionNumber + ". Rate the creativity of the the two creative responses:\n\n");
                            myWriter.write("1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                            myWriter.write("[[PageBreak]]\n\n");
                            breakLoop = false;
                        }
                    }
                }
            }
            myWriter.close();
        }
        String fileName = "TopTwoClock_50";
        FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
        for (int k = 0; k < 2; k++) {
            boolean breakLoop = true;
            while (breakLoop) {
                picker++;
                String temp = exractedData.get(picker).getClock_1();
                if (temp != null) {
                    if (!temp.isEmpty()) {
                        counter++;
                        String questionNumber = Integer.toString(counter);
                        master.write((picker + 1) + "\tClock\t" + "TopTwo: " + counter + "\n");
                        myWriter.write(questionNumber + ". Pick the top two creative responses for Clock:\n[[MultipleAnswer]]\n\n");
                        myWriter.write(temp + "\n");
                        exractedData.get(picker).setClock_1("");

                        temp = exractedData.get(picker).getClock_2();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setClock_2("");
                        }

                        temp = exractedData.get(picker).getClock_3();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setClock_3("");
                        }

                        temp = exractedData.get(picker).getClock_4();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setClock_4("");
                        }

                        temp = exractedData.get(picker).getClock_5();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setClock_5("");
                        }

                        temp = exractedData.get(picker).getClock_6();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setClock_6("");
                        }

                        temp = exractedData.get(picker).getClock_7();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setClock_7("");
                        }

                        temp = exractedData.get(picker).getClock_8();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setClock_8("");
                        }

                        temp = exractedData.get(picker).getClock_9();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setClock_9("");
                        }

                        temp = exractedData.get(picker).getClock_10();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setClock_10("");
                        }

                        temp = exractedData.get(picker).getClock_11();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setClock_11("");
                        }

                        temp = exractedData.get(picker).getClock_12();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setClock_12("");
                        }

                        temp = exractedData.get(picker).getClock_13();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setClock_13("");
                        }

                        temp = exractedData.get(picker).getClock_14();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setClock_14("");
                        }

                        temp = exractedData.get(picker).getClock_15();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setClock_15("");
                        }
                        myWriter.write("\n");
                        counter++;
                        questionNumber = Integer.toString(counter);
                        myWriter.write(questionNumber + ". Rate the creativity of the the two creative responses:\n\n");
                        myWriter.write("1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                        myWriter.write("[[PageBreak]]\n\n");
                        breakLoop = false;
                    }
                }
            }
        }
        myWriter.close();
    }

    public static void creatingTopTwoLens(List<OMCtoTxt.OMCExcelDataVariables> exractedData, FileWriter master) throws IOException {
        int counter = 0;
        int picker = 0;
        for (int j = 1; j <= 49; j++) {
            String fileName = "TopTwoLens_" + j;
            FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
            for (int k = 0; k < 10; k++) {
                boolean breakLoop = true;
                while (breakLoop) {
                    picker++;
                    String temp = exractedData.get(picker).getLens_1();
                    if (temp != null) {
                        if (!temp.isEmpty()) {
                            counter++;
                            String questionNumber = Integer.toString(counter);
                            master.write((picker + 1) + "\tLens\t" + "TopTwo: " + counter + "\n");
                            myWriter.write(questionNumber + ". Pick the top two creative responses for Lens:\n[[MultipleAnswer]]\n\n");
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLens_1("");

                            temp = exractedData.get(picker).getLens_2();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLens_2("");
                            }

                            temp = exractedData.get(picker).getLens_3();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLens_3("");
                            }

                            temp = exractedData.get(picker).getLens_4();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLens_4("");
                            }

                            temp = exractedData.get(picker).getLens_5();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLens_5("");
                            }

                            temp = exractedData.get(picker).getLens_6();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLens_6("");
                            }

                            temp = exractedData.get(picker).getLens_7();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLens_7("");
                            }

                            temp = exractedData.get(picker).getLens_8();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLens_8("");
                            }

                            temp = exractedData.get(picker).getLens_9();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLens_9("");
                            }

                            temp = exractedData.get(picker).getLens_10();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLens_10("");
                            }

                            temp = exractedData.get(picker).getLens_11();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLens_11("");
                            }

                            temp = exractedData.get(picker).getLens_12();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLens_12("");
                            }

                            temp = exractedData.get(picker).getLens_13();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLens_13("");
                            }

                            temp = exractedData.get(picker).getLens_14();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLens_14("");
                            }

                            temp = exractedData.get(picker).getLens_15();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setLens_15("");
                            }
                            myWriter.write("\n");
                            counter++;
                            questionNumber = Integer.toString(counter);
                            myWriter.write(questionNumber + ". Rate the creativity of the the two creative responses:\n\n");
                            myWriter.write("1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                            myWriter.write("[[PageBreak]]\n\n");
                            breakLoop = false;
                        }
                    }
                }
            }
            myWriter.close();
        }
        String fileName = "TopTwoLens_50";
        FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
        for (int k = 0; k < 1; k++) {
            boolean breakLoop = true;
            while (breakLoop) {
                picker++;
                String temp = exractedData.get(picker).getLens_1();
                if (temp != null) {
                    if (!temp.isEmpty()) {
                        counter++;
                        String questionNumber = Integer.toString(counter);
                        master.write((picker + 1) + "\tLens\t" + "TopTwo: " + counter + "\n");
                        myWriter.write(questionNumber + ". Pick the top two creative responses for Lens:\n[[MultipleAnswer]]\n\n");
                        myWriter.write(temp + "\n");
                        exractedData.get(picker).setLens_1("");

                        temp = exractedData.get(picker).getLens_2();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLens_2("");
                        }

                        temp = exractedData.get(picker).getLens_3();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLens_3("");
                        }

                        temp = exractedData.get(picker).getLens_4();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLens_4("");
                        }

                        temp = exractedData.get(picker).getLens_5();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLens_5("");
                        }

                        temp = exractedData.get(picker).getLens_6();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLens_6("");
                        }

                        temp = exractedData.get(picker).getLens_7();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLens_7("");
                        }

                        temp = exractedData.get(picker).getLens_8();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLens_8("");
                        }

                        temp = exractedData.get(picker).getLens_9();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLens_9("");
                        }

                        temp = exractedData.get(picker).getLens_10();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLens_10("");
                        }

                        temp = exractedData.get(picker).getLens_11();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLens_11("");
                        }

                        temp = exractedData.get(picker).getLens_12();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLens_12("");
                        }

                        temp = exractedData.get(picker).getLens_13();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLens_13("");
                        }

                        temp = exractedData.get(picker).getLens_14();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLens_14("");
                        }

                        temp = exractedData.get(picker).getLens_15();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setLens_15("");
                        }
                        myWriter.write("\n");
                        counter++;
                        questionNumber = Integer.toString(counter);
                        myWriter.write(questionNumber + ". Rate the creativity of the the two creative responses:\n\n");
                        myWriter.write("1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                        myWriter.write("[[PageBreak]]\n\n");
                        breakLoop = false;
                    }
                }
            }
            myWriter.close();
        }
    }

    public static void creatingTopTwoBalloon(List<OMCtoTxt.OMCExcelDataVariables> exractedData, FileWriter master) throws IOException {
        int counter = 0;
        int picker = 0;
        for (int j = 1; j <= 50; j++) {
            String fileName = "TopTwoBalloon_" + j;
            FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
            for (int k = 0; k < 10; k++) {
                boolean breakLoop = true;
                while (breakLoop) {
                    picker++;
                    String temp = exractedData.get(picker).getBalloon_1();
                    if (temp != null) {
                        if (!temp.isEmpty()) {
                            counter++;
                            String questionNumber = Integer.toString(counter);
                            master.write((picker + 1) + "\tBalloon\t" + "TopTwo: " + counter + "\n");
                            myWriter.write(questionNumber + ". Pick the top two creative responses for Balloon:\n[[MultipleAnswer]]\n\n");
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setBalloon_1("");

                            temp = exractedData.get(picker).getBalloon_2();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setBalloon_2("");
                            }

                            temp = exractedData.get(picker).getBalloon_3();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setBalloon_3("");
                            }

                            temp = exractedData.get(picker).getBalloon_4();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setBalloon_4("");
                            }

                            temp = exractedData.get(picker).getBalloon_5();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setBalloon_5("");
                            }

                            temp = exractedData.get(picker).getBalloon_6();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setBalloon_6("");
                            }

                            temp = exractedData.get(picker).getBalloon_7();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setBalloon_7("");
                            }

                            temp = exractedData.get(picker).getBalloon_8();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setBalloon_8("");
                            }

                            temp = exractedData.get(picker).getBalloon_9();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setBalloon_9("");
                            }

                            temp = exractedData.get(picker).getBalloon_10();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setBalloon_10("");
                            }

                            temp = exractedData.get(picker).getBalloon_11();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setBalloon_11("");
                            }

                            temp = exractedData.get(picker).getBalloon_12();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setBalloon_12("");
                            }

                            temp = exractedData.get(picker).getBalloon_13();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setBalloon_13("");
                            }

                            temp = exractedData.get(picker).getBalloon_14();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setBalloon_14("");
                            }

                            temp = exractedData.get(picker).getBalloon_15();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setBalloon_15("");
                            }
                            myWriter.write("\n");
                            counter++;
                            questionNumber = Integer.toString(counter);
                            myWriter.write(questionNumber + ". Rate the creativity of the the two creative responses:\n\n");
                            myWriter.write("1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                            myWriter.write("[[PageBreak]]\n\n");
                            breakLoop = false;
                        }
                    }
                }
            }
            myWriter.close();
        }
        String fileName = "TopTwoBalloon_51";
        FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
        for (int k = 0; k < 4; k++) {
            boolean breakLoop = true;
            while (breakLoop) {
                picker++;
                String temp = exractedData.get(picker).getBalloon_1();
                if (temp != null) {
                    if (!temp.isEmpty()) {
                        counter++;
                        String questionNumber = Integer.toString(counter);
                        master.write((picker + 1) + "\tBalloon\t" + "TopTwo: " + counter + "\n");
                        myWriter.write(questionNumber + ". Pick the top two creative responses for Balloon:\n[[MultipleAnswer]]\n\n");
                        myWriter.write(temp + "\n");
                        exractedData.get(picker).setBalloon_1("");

                        temp = exractedData.get(picker).getBalloon_2();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setBalloon_2("");
                        }

                        temp = exractedData.get(picker).getBalloon_3();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setBalloon_3("");
                        }

                        temp = exractedData.get(picker).getBalloon_4();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setBalloon_4("");
                        }

                        temp = exractedData.get(picker).getBalloon_5();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setBalloon_5("");
                        }

                        temp = exractedData.get(picker).getBalloon_6();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setBalloon_6("");
                        }

                        temp = exractedData.get(picker).getBalloon_7();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setBalloon_7("");
                        }

                        temp = exractedData.get(picker).getBalloon_8();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setBalloon_8("");
                        }

                        temp = exractedData.get(picker).getBalloon_9();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setBalloon_9("");
                        }

                        temp = exractedData.get(picker).getBalloon_10();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setBalloon_10("");
                        }

                        temp = exractedData.get(picker).getBalloon_11();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setBalloon_11("");
                        }

                        temp = exractedData.get(picker).getBalloon_12();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setBalloon_12("");
                        }

                        temp = exractedData.get(picker).getBalloon_13();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setBalloon_13("");
                        }

                        temp = exractedData.get(picker).getBalloon_14();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setBalloon_14("");
                        }

                        temp = exractedData.get(picker).getBalloon_15();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setBalloon_15("");
                        }
                        myWriter.write("\n");
                        counter++;
                        questionNumber = Integer.toString(counter);
                        myWriter.write(questionNumber + ". Rate the creativity of the the two creative responses:\n\n");
                        myWriter.write("1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                        myWriter.write("[[PageBreak]]\n\n");
                        breakLoop = false;
                    }
                }
            }
        }
        myWriter.close();
    }

    public static void creatingTopTwoSoap(List<OMCtoTxt.OMCExcelDataVariables> exractedData, FileWriter master) throws IOException {
        int counter = 0;
        int picker = 0;
        for (int j = 1; j <= 50; j++) {
            String fileName = "TopTwoSoap_" + j;
            FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
            for (int k = 0; k < 10; k++) {
                boolean breakLoop = true;
                while (breakLoop) {
                    picker++;
                    String temp = exractedData.get(picker).getSoap_1();
                    if (temp != null) {
                        if (!temp.isEmpty()) {
                            counter++;
                            String questionNumber = Integer.toString(counter);
                            master.write((picker + 1) + "\tSoap\t" + "TopTwo: " + counter + "\n");
                            myWriter.write(questionNumber + ". Pick the top two creative responses for Soap:\n[[MultipleAnswer]]\n\n");
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setSoap_1("");

                            temp = exractedData.get(picker).getSoap_2();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setSoap_2("");
                            }

                            temp = exractedData.get(picker).getSoap_3();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setSoap_3("");
                            }

                            temp = exractedData.get(picker).getSoap_4();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setSoap_4("");
                            }

                            temp = exractedData.get(picker).getSoap_5();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setSoap_5("");
                            }

                            temp = exractedData.get(picker).getSoap_6();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setSoap_6("");
                            }

                            temp = exractedData.get(picker).getSoap_7();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setSoap_7("");
                            }

                            temp = exractedData.get(picker).getSoap_8();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setSoap_8("");
                            }

                            temp = exractedData.get(picker).getSoap_9();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setSoap_9("");
                            }

                            temp = exractedData.get(picker).getSoap_10();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setSoap_10("");
                            }

                            temp = exractedData.get(picker).getSoap_11();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setSoap_11("");
                            }

                            temp = exractedData.get(picker).getSoap_12();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setSoap_12("");
                            }

                            temp = exractedData.get(picker).getSoap_13();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setSoap_13("");
                            }

                            temp = exractedData.get(picker).getSoap_14();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setSoap_14("");
                            }

                            temp = exractedData.get(picker).getSoap_15();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setSoap_15("");
                            }
                            myWriter.write("\n");
                            counter++;
                            questionNumber = Integer.toString(counter);
                            myWriter.write(questionNumber + ". Rate the creativity of the the two creative responses:\n\n");
                            myWriter.write("1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                            myWriter.write("[[PageBreak]]\n\n");
                            breakLoop = false;
                        }
                    }
                }
            }
            myWriter.close();
        }
        String fileName = "TopTwoSoap_51";
        FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
        for (int k = 0; k < 2; k++) {
            boolean breakLoop = true;
            while (breakLoop) {
                picker++;
                String temp = exractedData.get(picker).getSoap_1();
                if (temp != null) {
                    if (!temp.isEmpty()) {
                        counter++;
                        String questionNumber = Integer.toString(counter);
                        master.write((picker + 1) + "\tSoap\t" + "TopTwo: " + counter + "\n");
                        myWriter.write(questionNumber + ". Pick the top two creative responses for Soap:\n[[MultipleAnswer]]\n\n");
                        myWriter.write(temp + "\n");
                        exractedData.get(picker).setSoap_1("");

                        temp = exractedData.get(picker).getSoap_2();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setSoap_2("");
                        }

                        temp = exractedData.get(picker).getSoap_3();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setSoap_3("");
                        }

                        temp = exractedData.get(picker).getSoap_4();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setSoap_4("");
                        }

                        temp = exractedData.get(picker).getSoap_5();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setSoap_5("");
                        }

                        temp = exractedData.get(picker).getSoap_6();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setSoap_6("");
                        }

                        temp = exractedData.get(picker).getSoap_7();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setSoap_7("");
                        }

                        temp = exractedData.get(picker).getSoap_8();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setSoap_8("");
                        }

                        temp = exractedData.get(picker).getSoap_9();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setSoap_9("");
                        }

                        temp = exractedData.get(picker).getSoap_10();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setSoap_10("");
                        }

                        temp = exractedData.get(picker).getSoap_11();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setSoap_11("");
                        }

                        temp = exractedData.get(picker).getSoap_12();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setSoap_12("");
                        }

                        temp = exractedData.get(picker).getSoap_13();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setSoap_13("");
                        }

                        temp = exractedData.get(picker).getSoap_14();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setSoap_14("");
                        }

                        temp = exractedData.get(picker).getSoap_15();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setSoap_15("");
                        }
                        myWriter.write("\n");
                        counter++;
                        questionNumber = Integer.toString(counter);
                        myWriter.write(questionNumber + ". Rate the creativity of the the two creative responses:\n\n");
                        myWriter.write("1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                        myWriter.write("[[PageBreak]]\n\n");
                        breakLoop = false;
                    }
                }
            }
        }
        myWriter.close();
    }

    public static void creatingTopTwoStick(List<OMCtoTxt.OMCExcelDataVariables> exractedData, FileWriter master) throws IOException {
        int counter = 0;
        int picker = 0;
        for (int j = 1; j <= 50; j++) {
            String fileName = "TopTwoStick_" + j;
            FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
            for (int k = 0; k < 10; k++) {
                boolean breakLoop = true;
                while (breakLoop) {
                    picker++;
                    String temp = exractedData.get(picker).getStick_1();
                    if (temp != null) {
                        if (!temp.isEmpty()) {
                            counter++;
                            String questionNumber = Integer.toString(counter);
                            master.write((picker + 1) + "\tStick\t" + "TopTwo: " + counter + "\n");
                            myWriter.write(questionNumber + ". Pick the top two creative responses for Stick:\n[[MultipleAnswer]]\n\n");
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setStick_1("");

                            temp = exractedData.get(picker).getStick_2();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setStick_2("");
                            }

                            temp = exractedData.get(picker).getStick_3();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setStick_3("");
                            }

                            temp = exractedData.get(picker).getStick_4();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setStick_4("");
                            }

                            temp = exractedData.get(picker).getStick_5();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setStick_5("");
                            }

                            temp = exractedData.get(picker).getStick_6();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setStick_6("");
                            }

                            temp = exractedData.get(picker).getStick_7();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setStick_7("");
                            }

                            temp = exractedData.get(picker).getStick_8();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setStick_8("");
                            }

                            temp = exractedData.get(picker).getStick_9();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setStick_9("");
                            }

                            temp = exractedData.get(picker).getStick_10();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setStick_10("");
                            }

                            temp = exractedData.get(picker).getStick_11();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setStick_11("");
                            }

                            temp = exractedData.get(picker).getStick_12();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setStick_12("");
                            }

                            temp = exractedData.get(picker).getStick_13();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setStick_13("");
                            }

                            temp = exractedData.get(picker).getStick_14();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setStick_14("");
                            }

                            temp = exractedData.get(picker).getStick_15();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setStick_15("");
                            }
                            myWriter.write("\n");
                            counter++;
                            questionNumber = Integer.toString(counter);
                            myWriter.write(questionNumber + ". Rate the creativity of the the two creative responses:\n\n");
                            myWriter.write("1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                            myWriter.write("[[PageBreak]]\n\n");
                            breakLoop = false;
                        }
                    }
                }
            }
            myWriter.close();
        }
        String fileName = "TopTwoStick_51";
        FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
        for (int k = 0; k < 9; k++) {
            boolean breakLoop = true;
            while (breakLoop) {
                picker++;
                String temp = exractedData.get(picker).getStick_1();
                if (temp != null) {
                    if (!temp.isEmpty()) {
                        counter++;
                        String questionNumber = Integer.toString(counter);
                        master.write((picker + 1) + "\tStick\t" + "TopTwo: " + counter + "\n");
                        myWriter.write(questionNumber + ". Pick the top two creative responses for Stick:\n[[MultipleAnswer]]\n\n");
                        myWriter.write(temp + "\n");
                        exractedData.get(picker).setStick_1("");

                        temp = exractedData.get(picker).getStick_2();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setStick_2("");
                        }

                        temp = exractedData.get(picker).getStick_3();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setStick_3("");
                        }

                        temp = exractedData.get(picker).getStick_4();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setStick_4("");
                        }

                        temp = exractedData.get(picker).getStick_5();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setStick_5("");
                        }

                        temp = exractedData.get(picker).getStick_6();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setStick_6("");
                        }

                        temp = exractedData.get(picker).getStick_7();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setStick_7("");
                        }

                        temp = exractedData.get(picker).getStick_8();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setStick_8("");
                        }

                        temp = exractedData.get(picker).getStick_9();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setStick_9("");
                        }

                        temp = exractedData.get(picker).getStick_10();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setStick_10("");
                        }

                        temp = exractedData.get(picker).getStick_11();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setStick_11("");
                        }

                        temp = exractedData.get(picker).getStick_12();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setStick_12("");
                        }

                        temp = exractedData.get(picker).getStick_13();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setStick_13("");
                        }

                        temp = exractedData.get(picker).getStick_14();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setStick_14("");
                        }

                        temp = exractedData.get(picker).getStick_15();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setStick_15("");
                        }
                        myWriter.write("\n");
                        counter++;
                        questionNumber = Integer.toString(counter);
                        myWriter.write(questionNumber + ". Rate the creativity of the the two creative responses:\n\n");
                        myWriter.write("1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                        myWriter.write("[[PageBreak]]\n\n");
                        breakLoop = false;
                    }
                }
            }
        }
        myWriter.close();
    }

    public static void creatingTopTwoRope(List<OMCtoTxt.OMCExcelDataVariables> exractedData, FileWriter master) throws IOException {
        int counter = 0;
        int picker = 0;
        for (int j = 1; j <= 50; j++) {
            String fileName = "TopTwoRope_" + j;
            FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
            for (int k = 0; k < 10; k++) {
                boolean breakLoop = true;
                while (breakLoop) {
                    picker++;
                    String temp = exractedData.get(picker).getRope_1();
                    if (temp != null) {
                        if (!temp.isEmpty()) {
                            counter++;
                            String questionNumber = Integer.toString(counter);
                            master.write((picker + 1) + "\tRope\t" + "TopTwo: " + counter + "\n");
                            myWriter.write(questionNumber + ". Pick the top two creative responses for Rope:\n[[MultipleAnswer]]\n\n");
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setRope_1("");

                            temp = exractedData.get(picker).getRope_2();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setRope_2("");
                            }

                            temp = exractedData.get(picker).getRope_3();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setRope_3("");
                            }

                            temp = exractedData.get(picker).getRope_4();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setRope_4("");
                            }

                            temp = exractedData.get(picker).getRope_5();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setRope_5("");
                            }

                            temp = exractedData.get(picker).getRope_6();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setRope_6("");
                            }

                            temp = exractedData.get(picker).getRope_7();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setRope_7("");
                            }

                            temp = exractedData.get(picker).getRope_8();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setRope_8("");
                            }

                            temp = exractedData.get(picker).getRope_9();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setRope_9("");
                            }

                            temp = exractedData.get(picker).getRope_10();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setRope_10("");
                            }

                            temp = exractedData.get(picker).getRope_11();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setRope_11("");
                            }

                            temp = exractedData.get(picker).getRope_12();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setRope_12("");
                            }

                            temp = exractedData.get(picker).getRope_13();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setRope_13("");
                            }

                            temp = exractedData.get(picker).getRope_14();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setRope_14("");
                            }

                            temp = exractedData.get(picker).getRope_15();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setRope_15("");
                            }
                            myWriter.write("\n");
                            counter++;
                            questionNumber = Integer.toString(counter);
                            myWriter.write(questionNumber + ". Rate the creativity of the the two creative responses:\n\n");
                            myWriter.write("1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                            myWriter.write("[[PageBreak]]\n\n");
                            breakLoop = false;
                        }
                    }
                }
            }
            myWriter.close();
        }
        String fileName = "TopTwoRope_51";
        FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
        for (int k = 0; k < 2; k++) {
            boolean breakLoop = true;
            while (breakLoop) {
                picker++;
                String temp = exractedData.get(picker).getRope_1();
                if (temp != null) {
                    if (!temp.isEmpty()) {
                        counter++;
                        String questionNumber = Integer.toString(counter);
                        master.write((picker + 1) + "\tRope\t" + "TopTwo: " + counter + "\n");
                        myWriter.write(questionNumber + ". Pick the top two creative responses for Rope:\n[[MultipleAnswer]]\n\n");
                        myWriter.write(temp + "\n");
                        exractedData.get(picker).setRope_1("");

                        temp = exractedData.get(picker).getRope_2();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setRope_2("");
                        }

                        temp = exractedData.get(picker).getRope_3();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setRope_3("");
                        }

                        temp = exractedData.get(picker).getRope_4();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setRope_4("");
                        }

                        temp = exractedData.get(picker).getRope_5();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setRope_5("");
                        }

                        temp = exractedData.get(picker).getRope_6();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setRope_6("");
                        }

                        temp = exractedData.get(picker).getRope_7();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setRope_7("");
                        }

                        temp = exractedData.get(picker).getRope_8();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setRope_8("");
                        }

                        temp = exractedData.get(picker).getRope_9();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setRope_9("");
                        }

                        temp = exractedData.get(picker).getRope_10();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setRope_10("");
                        }

                        temp = exractedData.get(picker).getRope_11();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setRope_11("");
                        }

                        temp = exractedData.get(picker).getRope_12();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setRope_12("");
                        }

                        temp = exractedData.get(picker).getRope_13();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setRope_13("");
                        }

                        temp = exractedData.get(picker).getRope_14();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setRope_14("");
                        }

                        temp = exractedData.get(picker).getRope_15();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setRope_15("");
                        }
                        myWriter.write("\n");
                        counter++;
                        questionNumber = Integer.toString(counter);
                        myWriter.write(questionNumber + ". Rate the creativity of the the two creative responses:\n\n");
                        myWriter.write("1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                        myWriter.write("[[PageBreak]]\n\n");
                        breakLoop = false;
                    }
                }
            }
        }
        myWriter.close();
    }

    public static void creatingTopTwoMarble(List<OMCtoTxt.OMCExcelDataVariables> exractedData, FileWriter master) throws IOException {
        int counter = 0;
        int picker = 0;
        for (int j = 1; j <= 49; j++) {
            String fileName = "TopTwoMarble_" + j;
            FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
            for (int k = 0; k < 10; k++) {
                boolean breakLoop = true;
                while (breakLoop) {
                    picker++;
                    String temp = exractedData.get(picker).getMarble_1();
                    if (temp != null) {
                        if (!temp.isEmpty()) {
                            counter++;
                            String questionNumber = Integer.toString(counter);
                            master.write((picker + 1) + "\tMarble\t" + "TopTwo: " + counter + "\n");
                            myWriter.write(questionNumber + ". Pick the top two creative responses for Marble:\n[[MultipleAnswer]]\n\n");
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setMarble_1("");

                            temp = exractedData.get(picker).getMarble_2();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setMarble_2("");
                            }

                            temp = exractedData.get(picker).getMarble_3();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setMarble_3("");
                            }

                            temp = exractedData.get(picker).getMarble_4();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setMarble_4("");
                            }

                            temp = exractedData.get(picker).getMarble_5();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setMarble_5("");
                            }

                            temp = exractedData.get(picker).getMarble_6();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setMarble_6("");
                            }

                            temp = exractedData.get(picker).getMarble_7();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setMarble_7("");
                            }

                            temp = exractedData.get(picker).getMarble_8();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setMarble_8("");
                            }

                            temp = exractedData.get(picker).getMarble_9();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setMarble_9("");
                            }

                            temp = exractedData.get(picker).getMarble_10();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setMarble_10("");
                            }

                            temp = exractedData.get(picker).getMarble_11();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setMarble_11("");
                            }

                            temp = exractedData.get(picker).getMarble_12();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setMarble_12("");
                            }

                            temp = exractedData.get(picker).getMarble_13();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setMarble_13("");
                            }

                            temp = exractedData.get(picker).getMarble_14();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setMarble_14("");
                            }

                            temp = exractedData.get(picker).getMarble_15();
                            if (!temp.equals("")) {
                                myWriter.write(temp + "\n");
                                exractedData.get(picker).setMarble_15("");
                            }
                            myWriter.write("\n");
                            counter++;
                            questionNumber = Integer.toString(counter);
                            myWriter.write(questionNumber + ". Rate the creativity of the the two creative responses:\n\n");
                            myWriter.write("1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                            myWriter.write("[[PageBreak]]\n\n");
                            breakLoop = false;
                        }
                    }
                }
            }
            myWriter.close();
        }
        String fileName = "TopTwoMarble_50";
        FileWriter myWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/" + fileName + ".txt");
        for (int k = 0; k < 7; k++) {
            boolean breakLoop = true;
            while (breakLoop) {
                picker++;
                String temp = exractedData.get(picker).getMarble_1();
                if (temp != null) {
                    if (!temp.isEmpty()) {
                        counter++;
                        String questionNumber = Integer.toString(counter);
                        master.write((picker + 1) + "\tMarble\t" + "TopTwo: " + counter + "\n");
                        myWriter.write(questionNumber + ". Pick the top two creative responses for Marble:\n[[MultipleAnswer]]\n\n");
                        myWriter.write(temp + "\n");
                        exractedData.get(picker).setMarble_1("");

                        temp = exractedData.get(picker).getMarble_2();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setMarble_2("");
                        }

                        temp = exractedData.get(picker).getMarble_3();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setMarble_3("");
                        }

                        temp = exractedData.get(picker).getMarble_4();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setMarble_4("");
                        }

                        temp = exractedData.get(picker).getMarble_5();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setMarble_5("");
                        }

                        temp = exractedData.get(picker).getMarble_6();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setMarble_6("");
                        }

                        temp = exractedData.get(picker).getMarble_7();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setMarble_7("");
                        }

                        temp = exractedData.get(picker).getMarble_8();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setMarble_8("");
                        }

                        temp = exractedData.get(picker).getMarble_9();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setMarble_9("");
                        }

                        temp = exractedData.get(picker).getMarble_10();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setMarble_10("");
                        }

                        temp = exractedData.get(picker).getMarble_11();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setMarble_11("");
                        }

                        temp = exractedData.get(picker).getMarble_12();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setMarble_12("");
                        }

                        temp = exractedData.get(picker).getMarble_13();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setMarble_13("");
                        }

                        temp = exractedData.get(picker).getMarble_14();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setMarble_14("");
                        }

                        temp = exractedData.get(picker).getMarble_15();
                        if (!temp.equals("")) {
                            myWriter.write(temp + "\n");
                            exractedData.get(picker).setMarble_15("");
                        }
                        myWriter.write("\n");
                        counter++;
                        questionNumber = Integer.toString(counter);
                        myWriter.write(questionNumber + ". Rate the creativity of the the two creative responses:\n\n");
                        myWriter.write("1 (uncreative)\n2\n3\n4\n5 (very creative)\n\n");
                        myWriter.write("[[PageBreak]]\n\n");
                        breakLoop = false;
                    }
                }
            }
        }
        myWriter.close();
    }

    public static void main(String[] args) throws IOException {

        OMCtoTxt.GetContentFromExcelSheets getContentFromExcelSheets = new OMCtoTxt.GetContentFromExcelSheets();
        List<OMCtoTxt.OMCExcelDataVariables> extratedData = new ArrayList<>();
        try {
            extratedData = getContentFromExcelSheets.readDataFromExcelFile("/Users/augustazukauskas/desktop/Files/OMC_Correlation_Study_F20-S21_April_20__Deidentified.xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Creation of the Master Set, this will contain the information of what data is in each text file.
        // The text file will be in chronological order of when the words appear on the Excel file
        FileWriter masterWriter = new FileWriter("/Users/augustazukauskas/desktop/Files/Created Files/Master Set.txt");
        // Sets up the text file with the parameters
        masterWriter.write("Par #\tObject\tQuestion #\n");

        creatingSnapShotPen(extratedData, masterWriter);
        creatingSnapShotFork(extratedData, masterWriter);
        creatingSnapShotLamp(extratedData, masterWriter);
        creatingSnapShotClock(extratedData, masterWriter);
        creatingSnapShotLens(extratedData, masterWriter);
        creatingSnapShotBalloon(extratedData, masterWriter);
        creatingSnapShotSoap(extratedData, masterWriter);
        creatingSnapShotStick(extratedData, masterWriter);
        creatingSnapShotRope(extratedData, masterWriter);
        creatingSnapShotMarble(extratedData, masterWriter);

        List<OMCtoTxt.OMCExcelDataVariables> extratedData2 = new ArrayList<>();
        try {
            extratedData2 = getContentFromExcelSheets.readDataFromExcelFile("/Users/augustazukauskas/desktop/Files/OMC_Correlation_Study_F20-S21_April_20__Deidentified.xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }

        creatingTopTwoPen(extratedData2, masterWriter);
        creatingTopTwoFork(extratedData2, masterWriter);
        creatingTopTwoLamp(extratedData2, masterWriter);
        creatingTopTwoClock(extratedData2, masterWriter);
        creatingTopTwoLens(extratedData2, masterWriter);
        creatingTopTwoBalloon(extratedData2, masterWriter);
        creatingTopTwoSoap(extratedData2, masterWriter);
        creatingTopTwoStick(extratedData2, masterWriter);
        creatingTopTwoRope(extratedData2,masterWriter);
        creatingTopTwoMarble(extratedData2, masterWriter);

        masterWriter.close();

        /*
        Was used to check if the data was getting pulled and deleted
        for (int i = 0; i < extratedData.size(); i++) {
            System.out.println(extratedData.get(i).toString());
        }
        for (int i = 0; i < extratedData2.size(); i++) {
            System.out.println(extratedData2.get(i).toString());
        }
         */
    }
}
