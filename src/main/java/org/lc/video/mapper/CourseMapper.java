package org.lc.video.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lc.video.model.Course;
import org.lc.video.model.CourseExample;

public interface CourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    long countByExample(CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    int deleteByExample(CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    int deleteByPrimaryKey(Long courseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    int insert(Course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    int insertSelective(Course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    List<Course> selectByExample(CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    Course selectByPrimaryKey(Long courseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    int updateByPrimaryKeySelective(Course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    int updateByPrimaryKey(Course record);
}