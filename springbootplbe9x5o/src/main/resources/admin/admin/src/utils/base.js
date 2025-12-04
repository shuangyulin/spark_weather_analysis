const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootplbe9x5o/",
            name: "springbootplbe9x5o",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "基于spark的西南天气数据的分析与应用"
        } 
    }
}
export default base
