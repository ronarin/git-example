package git.example.gitexample.domain

import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Options
import org.apache.ibatis.annotations.Select

@Mapper
interface UserMapper {

    @Insert("""
        insert into users 
            (name , email)
        values
            (#{name} , #{email})
    """)
    @Options(useGeneratedKeys = true, keyProperty = "user_id")
    fun insert(users: User)

    @Select("""
        select 
            user_id , name , email
        from
            users
        where
            user_id = #{id}
    """)
    fun select(id: Int):User
}