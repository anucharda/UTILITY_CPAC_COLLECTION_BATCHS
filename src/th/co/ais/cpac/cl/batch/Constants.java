/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.ais.cpac.cl.batch;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Optimus
 */
public class Constants extends th.co.ais.cpac.cl.template.configuration.Constants {

  public enum ActionTrigerType {
    DebtAge(1),
    StatusAge(2),
    ActionAge(3),
    NULL(-9999);

    private final int code;

    private ActionTrigerType(int code) {
      this.code = code;
    }

    public int getCode() {
      return code;
    }
  }

  public static final ActionTrigerType mapActionTrigerType(int code) {
    if (ActionTrigerType.DebtAge.getCode() == code) {
      return ActionTrigerType.DebtAge;
    } else if (ActionTrigerType.StatusAge.getCode() == code) {
      return ActionTrigerType.StatusAge;
    } else if (ActionTrigerType.ActionAge.getCode() == code) {
      return ActionTrigerType.ActionAge;
    }
    return ActionTrigerType.NULL;
  }

  public enum ActionTriger {
    DueDate(1),
    SD1Date(2),
    SD2Date(3),
    SD3Date(4),
    DTDate(5),
    TLDate(6),
    NLDate(7),
    NULL(-9999);
    private final int code;

    private ActionTriger(int code) {
      this.code = code;
    }

    public int getCode() {
      return code;
    }

    public String getKeyActionTriger() {
      switch (code) {
        case 1: {
          return "DueDate";
        }
        case 2: {
          return "SD1Date";
        }
        case 3: {
          return "SD2Date";
        }
        case 4: {
          return "SD3Date";
        }
        case 5: {
          return "DTDate";
        }
        case 6: {
          return "TLDate";
        }
        case 7: {
          return "NLDate";
        }
      }
      return "NULL";
    }

  }

  public static final ActionTriger mapActionTriger(int code) {

    if (ActionTriger.DueDate.getCode() == code) {
      return ActionTriger.DueDate;
    } else if (ActionTriger.SD1Date.getCode() == code) {
      return ActionTriger.SD1Date;
    } else if (ActionTriger.SD2Date.getCode() == code) {
      return ActionTriger.SD2Date;
    } else if (ActionTriger.SD3Date.getCode() == code) {
      return ActionTriger.SD3Date;
    } else if (ActionTriger.DTDate.getCode() == code) {
      return ActionTriger.DTDate;
    } else if (ActionTriger.TLDate.getCode() == code) {
      return ActionTriger.TLDate;
    } else if (ActionTriger.NLDate.getCode() == code) {
      return ActionTriger.NLDate;
    }
    return ActionTriger.NULL;
  }

  public enum ActionMode {
    SMS(1),
    TELE(2),
    SuspendDebt(3),
    Terminate(4),
    Letter(5),
    ThirdParty(6),
    Legal(7),
    Waive(8),
    WriteOff(9),
    Blacklist(10),
    DeBlacklist(11),
    Reconnect(12),
    NULL(-9999);

    private final int code;

    private ActionMode(int code) {
      this.code = code;
    }

    public int getCode() {
      return code;
    }

    public String getCodeString() {
      switch (code) {
        case 1:
          return "TS";
        case 2:
          return "TH";
        case 3:
          return "SD";
        case 4:
          return "DT";
        case 5:
          return "LT";
        case 6:
          return "TP";
        case 7:
          return "LG";
        case 8:
          return "WA";
        case 9:
          return "WO";
        case 10:
          return "BL";
        case 11:
          return "DL";
        case 12:
          return "RC";
      }
      return "NULL";
    }
  }

  public static final ActionMode mapActionMode(int code) {
    if (ActionMode.SMS.getCode() == code) {
      return ActionMode.SMS;
    } else if (ActionMode.TELE.getCode() == code) {
      return ActionMode.TELE;
    } else if (ActionMode.SuspendDebt.getCode() == code) {
      return ActionMode.SuspendDebt;
    } else if (ActionMode.Terminate.getCode() == code) {
      return ActionMode.Terminate;
    } else if (ActionMode.Letter.getCode() == code) {
      return ActionMode.Letter;
    } else if (ActionMode.ThirdParty.getCode() == code) {
      return ActionMode.ThirdParty;
    } else if (ActionMode.Legal.getCode() == code) {
      return ActionMode.Legal;
    } else if (ActionMode.Waive.getCode() == code) {
      return ActionMode.Waive;
    } else if (ActionMode.WriteOff.getCode() == code) {
      return ActionMode.WriteOff;
    } else if (ActionMode.Blacklist.getCode() == code) {
      return ActionMode.Blacklist;
    } else if (ActionMode.DeBlacklist.getCode() == code) {
      return ActionMode.DeBlacklist;
    } else if (ActionMode.Reconnect.getCode() == code) {
      return ActionMode.Reconnect;
    }
    return ActionMode.NULL;
  }

  public enum ActionOperator {
    MINUS(1), PLUS(2), NULL(-9999);
    private final int code;

    private ActionOperator(int code) {
      this.code = code;
    }

    public int getCode() {
      return code;
    }

    public int getValue() {
      switch (code) {
        case 1:
          return -1;
        case 2:
          return 1;
      }
      return 0;
    }

  }

  public static final ActionOperator mapActionOperator(int code) {
    if (ActionOperator.MINUS.getCode() == code) {
      return ActionOperator.MINUS;
    } else if (ActionOperator.PLUS.getCode() == code) {
      return ActionOperator.PLUS;
    }
    return ActionOperator.NULL;
  }

  public static final ActionOperator mapActionOperator(String code) {
    if ("-".equals(code)) {
      return ActionOperator.MINUS;
    } else if ("+".equals(code)) {
      return ActionOperator.PLUS;
    }
    return ActionOperator.NULL;
  }

  public enum ActionStatus {
    UnqualifiedChangeActionCriteria(-9),
    UnqualifiedChangePath(-8),
    UnqualifiedChangeAction(-7),
    UnqualifiedChangeSchedule(-6),
    UnqualifiedExemption(-5),
    UnqualifiedAdjustment(-4),
    UnqualifiedPaid(-3),
    UnqualifiedRejected(-2),
    UnqualifiedNoTreatment(-1),
    VerifyingData(0),
    WaitingtoConfirm(1),
    WaitingtoProcess(2),
    InProgress(3),
    Complete(4),
    Incomplete(5),
    Failed(6),
    NULL(-9999);

    private final int code;

    private ActionStatus(int code) {
      this.code = code;
    }

    public int getCode() {
      return code;
    }
  }

  public static final ActionStatus mapActionStatus(int code) {
    if (ActionStatus.UnqualifiedChangePath.getCode() == code) {
      return ActionStatus.UnqualifiedChangePath;
    } else if (ActionStatus.UnqualifiedChangeAction.getCode() == code) {
      return ActionStatus.UnqualifiedChangeAction;
    } else if (ActionStatus.UnqualifiedChangeSchedule.getCode() == code) {
      return ActionStatus.UnqualifiedChangeSchedule;
    } else if (ActionStatus.UnqualifiedExemption.getCode() == code) {
      return ActionStatus.UnqualifiedExemption;
    } else if (ActionStatus.UnqualifiedAdjustment.getCode() == code) {
      return ActionStatus.UnqualifiedAdjustment;
    } else if (ActionStatus.UnqualifiedPaid.getCode() == code) {
      return ActionStatus.UnqualifiedPaid;
    } else if (ActionStatus.UnqualifiedRejected.getCode() == code) {
      return ActionStatus.UnqualifiedRejected;
    } else if (ActionStatus.UnqualifiedNoTreatment.getCode() == code) {
      return ActionStatus.UnqualifiedNoTreatment;
    } else if (ActionStatus.VerifyingData.getCode() == code) {
      return ActionStatus.VerifyingData;
    } else if (ActionStatus.WaitingtoConfirm.getCode() == code) {
      return ActionStatus.WaitingtoConfirm;
    } else if (ActionStatus.WaitingtoProcess.getCode() == code) {
      return ActionStatus.WaitingtoProcess;
    } else if (ActionStatus.InProgress.getCode() == code) {
      return ActionStatus.InProgress;
    } else if (ActionStatus.Complete.getCode() == code) {
      return ActionStatus.Complete;
    } else if (ActionStatus.Incomplete.getCode() == code) {
      return ActionStatus.Incomplete;
    } else if (ActionStatus.Failed.getCode() == code) {
      return ActionStatus.Failed;
    } else if (ActionStatus.UnqualifiedChangeActionCriteria.getCode() == code) {
      return ActionStatus.UnqualifiedChangeActionCriteria;
    }

    return ActionStatus.NULL;
  }

  public enum ActionType {
    PreDue(1),
    PreSuspend(2),
    Suspend1(3),
    PostSuspend1(4),
    Suspend2(5),
    PostSuspend2(6),
    Suspend3(7),
    PostSuspend3(8),
    Terminate(9),
    PostTerminate(10),
    TerminateLetter(11),
    PostTerminateLetter(12),
    NoticeLeller(13),
    PostNotice(14),
    NULL(-9999);

    private final int code;

    private ActionType(int code) {
      this.code = code;
    }

    public int getCode() {
      return code;
    }
  }

  public static final ActionType mapActionType(int code) {
    if (ActionType.PreDue.getCode() == code) {
      return ActionType.PreDue;
    } else if (ActionType.PreSuspend.getCode() == code) {
      return ActionType.PreSuspend;
    } else if (ActionType.Suspend1.getCode() == code) {
      return ActionType.Suspend1;
    } else if (ActionType.PostSuspend1.getCode() == code) {
      return ActionType.PostSuspend1;
    } else if (ActionType.Suspend2.getCode() == code) {
      return ActionType.Suspend2;
    } else if (ActionType.PostSuspend2.getCode() == code) {
      return ActionType.PostSuspend2;
    } else if (ActionType.Terminate.getCode() == code) {
      return ActionType.Terminate;
    } else if (ActionType.PostTerminate.getCode() == code) {
      return ActionType.PostTerminate;
    }
    return ActionType.NULL;
  }

  public enum PriorityStatus {
    Active(1),
    Suspend1(2),
    Suspend2(3),
    SuspendDebt1(4),
    SuspendDebt2(5),
    SuspendDebt3(6),
    SuspendCreditLimit1(7),
    SuspendCreditLimit2(8),
    SuspendCreditLimit3(9),
    SuspendFraud1(10),
    SuspendFraud2(11),
    SuspendFraud3(12),
    Disconnect(13),
    Terminate(14),
    Inactive(15),
    Other(16),
    NULL(-9999);

    private final int code;

    private PriorityStatus(int code) {
      this.code = code;
    }

    public int getCode() {
      return code;
    }

  }

  public static final PriorityStatus mapPriorityStatus(int code) {
    if (PriorityStatus.Active.getCode() == code) {
      return PriorityStatus.Active;
    } else if (PriorityStatus.Suspend1.getCode() == code) {
      return PriorityStatus.Suspend1;
    } else if (PriorityStatus.Suspend2.getCode() == code) {
      return PriorityStatus.Suspend2;
    } else if (PriorityStatus.SuspendDebt1.getCode() == code) {
      return PriorityStatus.SuspendDebt1;
    } else if (PriorityStatus.SuspendDebt2.getCode() == code) {
      return PriorityStatus.SuspendDebt2;
    } else if (PriorityStatus.SuspendDebt3.getCode() == code) {
      return PriorityStatus.SuspendDebt3;
    } else if (PriorityStatus.SuspendCreditLimit1.getCode() == code) {
      return PriorityStatus.SuspendCreditLimit1;
    } else if (PriorityStatus.SuspendCreditLimit2.getCode() == code) {
      return PriorityStatus.SuspendCreditLimit2;
    } else if (PriorityStatus.SuspendCreditLimit3.getCode() == code) {
      return PriorityStatus.SuspendCreditLimit3;
    } else if (PriorityStatus.SuspendFraud1.getCode() == code) {
      return PriorityStatus.SuspendFraud1;
    } else if (PriorityStatus.SuspendFraud2.getCode() == code) {
      return PriorityStatus.SuspendFraud2;
    } else if (PriorityStatus.SuspendFraud3.getCode() == code) {
      return PriorityStatus.SuspendFraud3;
    } else if (PriorityStatus.Disconnect.getCode() == code) {
      return PriorityStatus.Disconnect;
    } else if (PriorityStatus.Terminate.getCode() == code) {
      return PriorityStatus.Terminate;
    } else if (PriorityStatus.Inactive.getCode() == code) {
      return PriorityStatus.Inactive;
    } else if (PriorityStatus.Other.getCode() == code) {
      return PriorityStatus.Other;
    }
    return PriorityStatus.NULL;
  }

  public enum PriorityStatusGroup {
    Active(1),
    Suspend1(2),
    Suspend2(3),
    Suspend3(4),
    TerminateAndInactive(5),
    Other(6),
    NULL(-9999);

    private final int code;

    private PriorityStatusGroup(int code) {
      this.code = code;
    }

    public int getCode() {
      return code;
    }

  }

  public static final PriorityStatusGroup mapPriorityStatusGroup(int code) {
    if (PriorityStatusGroup.Active.getCode() == code) {
      return PriorityStatusGroup.Active;
    } else if (PriorityStatusGroup.Suspend1.getCode() == code) {
      return PriorityStatusGroup.Suspend1;
    } else if (PriorityStatusGroup.Suspend2.getCode() == code) {
      return PriorityStatusGroup.Suspend2;
    } else if (PriorityStatusGroup.Suspend3.getCode() == code) {
      return PriorityStatusGroup.Suspend3;
    } else if (PriorityStatusGroup.TerminateAndInactive.getCode() == code) {
      return PriorityStatusGroup.TerminateAndInactive;
    } else if (PriorityStatusGroup.Other.getCode() == code) {
      return PriorityStatusGroup.Other;
    }
    return PriorityStatusGroup.NULL;
  }

  public enum PriorityStatusGroupStatus {
    Active(1),
    Suspend(2),
    Disconnect(3),
    Terminate(4),
    Inactive(5),
    Other(9),
    NULL(-9999);

    private final int code;

    private PriorityStatusGroupStatus(int code) {
      this.code = code;
    }

    public int getCode() {
      return code;
    }

  }

  public static final PriorityStatusGroupStatus mapPriorityStatusGroupStatus(int code) {
    if (PriorityStatusGroupStatus.Active.getCode() == code) {
      return PriorityStatusGroupStatus.Active;
    } else if (PriorityStatusGroupStatus.Suspend.getCode() == code) {
      return PriorityStatusGroupStatus.Suspend;
    } else if (PriorityStatusGroupStatus.Disconnect.getCode() == code) {
      return PriorityStatusGroupStatus.Disconnect;
    } else if (PriorityStatusGroupStatus.Terminate.getCode() == code) {
      return PriorityStatusGroupStatus.Terminate;
    } else if (PriorityStatusGroupStatus.Inactive.getCode() == code) {
      return PriorityStatusGroupStatus.Inactive;
    } else if (PriorityStatusGroupStatus.Other.getCode() == code) {
      return PriorityStatusGroupStatus.Other;
    }
    return PriorityStatusGroupStatus.NULL;
  }

  public enum ActionPeriodType {
    Day(1), Month(2), NULL(-9999);
    private final int code;

    private ActionPeriodType(int code) {
      this.code = code;
    }

    public int getCode() {
      return code;
    }

    public Date calculate(Date d, BigDecimal val) {
      try {
        Calendar now = Calendar.getInstance();
        now.setTime(d);
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        switch (code) {
          case 1: {
            c.add(Calendar.DATE, val.intValue());
            return c.getTime();
          }
          case 2: {
            c.add(Calendar.MONTH, val.intValue());
            if (c.get(Calendar.DATE) == now.get(Calendar.DATE)) {
              c.add(Calendar.DATE, -1);
            }
            return c.getTime();
          }
        }
      } catch (Exception ex) {

      }
      return null;
    }

  }

  public static final ActionPeriodType mapActionPeriodType(int code) {
    if (ActionPeriodType.Day.getCode() == code) {
      return ActionPeriodType.Day;
    } else if (ActionPeriodType.Month.getCode() == code) {
      return ActionPeriodType.Month;
    }
    return ActionPeriodType.NULL;
  }

  public enum CalendarType {
    /*
      System Maintenance
      วันหยุดนักขัตฤกษ์
      วันหยุดเสาร์อาทิตย์
      วันศุกร์
      ช่วงเทศกาล
      ช่วงเหตุภัยพิบัติ
      ช่วงเหตุการณ์สำคัญอื่นๆ
     */
    SystemMaintenance(1),
    Holiday(2),
    Weekend(3),
    Friday(4),
    Festival(5),
    Disaster(6),
    OtherEvents(7),
    NULL(-9999);
    private final int code;

    private CalendarType(int code) {
      this.code = code;
    }

    public int getCode() {
      return code;
    }
  }

  public static final CalendarType mapCalendarType(int code) {
    if (CalendarType.SystemMaintenance.getCode() == code) {
      return CalendarType.SystemMaintenance;
    } else if (CalendarType.Holiday.getCode() == code) {
      return CalendarType.Holiday;
    } else if (CalendarType.Weekend.getCode() == code) {
      return CalendarType.Weekend;
    } else if (CalendarType.Friday.getCode() == code) {
      return CalendarType.Friday;
    } else if (CalendarType.Festival.getCode() == code) {
      return CalendarType.Festival;
    } else if (CalendarType.Disaster.getCode() == code) {
      return CalendarType.Disaster;
    } else if (CalendarType.OtherEvents.getCode() == code) {
      return CalendarType.OtherEvents;
    }
    return CalendarType.NULL;
  }

  public enum LogCriteriaOption {
    VerifyOnly(1),
    VerifyAndRun(2),
    NULL(-9999);
    private final int code;

    private LogCriteriaOption(int code) {
      this.code = code;
    }

    public int getCode() {
      return code;
    }

  }

  public static final LogCriteriaOption mapLogCriteriaOption(int code) {
    if (LogCriteriaOption.VerifyOnly.getCode() == code) {
      return LogCriteriaOption.VerifyOnly;
    } else if (LogCriteriaOption.VerifyAndRun.getCode() == code) {
      return LogCriteriaOption.VerifyAndRun;
    }
    return LogCriteriaOption.NULL;
  }

  public enum LogCriteriaStatus {
    /*      
    Processing
    รอตรวจสอบ
    ตรวจสอบแล้ว เก็บข้อมูลไว้ก่อน
    ตรวจสอบแล้ว รอ Purge ข้อมูล
     */

    Processing(1),
    WaitVerify(2),
    VerifyAndKeep(3),
    VerifyAndPurge(4),
    NULL(-9999);
    private final int code;

    private LogCriteriaStatus(int code) {
      this.code = code;
    }

    public int getCode() {
      return code;
    }

  }

  public static final LogCriteriaStatus mapLogCriteriaStatus(int code) {
    if (LogCriteriaStatus.Processing.getCode() == code) {
      return LogCriteriaStatus.Processing;
    } else if (LogCriteriaStatus.WaitVerify.getCode() == code) {
      return LogCriteriaStatus.WaitVerify;
    } else if (LogCriteriaStatus.VerifyAndKeep.getCode() == code) {
      return LogCriteriaStatus.VerifyAndKeep;
    } else if (LogCriteriaStatus.VerifyAndPurge.getCode() == code) {
      return LogCriteriaStatus.VerifyAndPurge;
    }
    return LogCriteriaStatus.NULL;
  }

  public enum LogCriteriaType {
    Path(1),
    Action(2),
    NULL(-9999);
    private final int code;

    private LogCriteriaType(int code) {
      this.code = code;
    }

    public int getCode() {
      return code;
    }

  }

  public static final LogCriteriaType mapLogCriteriaType(int code) {
    if (LogCriteriaType.Path.getCode() == code) {
      return LogCriteriaType.Path;
    } else if (LogCriteriaType.Action.getCode() == code) {
      return LogCriteriaType.Action;
    }
    return LogCriteriaType.NULL;
  }

  public enum ParameterSMS {
    REFFERENCE_MOBILE(1),
    BALANCE_MNY(2),
    NULL(-9999);
    private final int code;

    private ParameterSMS(int code) {
      this.code = code;
    }

    public int getCode() {
      return code;
    }

  }

  public static final ParameterSMS mapParameterSMS(int code) {
    if (ParameterSMS.REFFERENCE_MOBILE.getCode() == code) {
      return ParameterSMS.REFFERENCE_MOBILE;
    } else if (ParameterSMS.BALANCE_MNY.getCode() == code) {
      return ParameterSMS.BALANCE_MNY;
    }
    return ParameterSMS.NULL;
  }

 
  
  
  /**
   * ** ------------ *
   */
  public static void main(String[] args) throws ParseException {

    ActionStatus mode = mapActionStatus(10);
    switch (mode) {
      case Complete: {
        break;
      }
      case InProgress: {
        break;
      }
    }

//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//    Date dd = sdf.parse("2016-02-01");
//
//    System.out.println(ActionPeriodType.Month.calculate(dd, BigDecimal.ONE));
  }

}
