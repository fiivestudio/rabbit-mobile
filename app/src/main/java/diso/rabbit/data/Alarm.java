package diso.rabbit.data;

import diso.rabbit.data.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table ALARM.
 */
public class Alarm {

    private Long id;
    /** Not-null value. */
    private String Title;
    private String Description;
    /** Not-null value. */
    private java.util.Date AlarmDate;
    private Long IdCourse;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient AlarmDao myDao;

    private Course course;
    private Long course__resolvedKey;


    public Alarm() {
    }

    public Alarm(Long id) {
        this.id = id;
    }

    public Alarm(Long id, String Title, String Description, java.util.Date AlarmDate, Long IdCourse) {
        this.id = id;
        this.Title = Title;
        this.Description = Description;
        this.AlarmDate = AlarmDate;
        this.IdCourse = IdCourse;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getAlarmDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getTitle() {
        return Title;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    /** Not-null value. */
    public java.util.Date getAlarmDate() {
        return AlarmDate;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setAlarmDate(java.util.Date AlarmDate) {
        this.AlarmDate = AlarmDate;
    }

    public Long getIdCourse() {
        return IdCourse;
    }

    public void setIdCourse(Long IdCourse) {
        this.IdCourse = IdCourse;
    }

    /** To-one relationship, resolved on first access. */
    public Course getCourse() {
        Long __key = this.IdCourse;
        if (course__resolvedKey == null || !course__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            CourseDao targetDao = daoSession.getCourseDao();
            Course courseNew = targetDao.load(__key);
            synchronized (this) {
                course = courseNew;
            	course__resolvedKey = __key;
            }
        }
        return course;
    }

    public void setCourse(Course course) {
        synchronized (this) {
            this.course = course;
            IdCourse = course == null ? null : course.getId();
            course__resolvedKey = IdCourse;
        }
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}
