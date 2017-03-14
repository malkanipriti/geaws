// including plugins
var gulp = require('gulp')
, jshint = require("gulp-jshint");
 
// task
gulp.task('jsLint', function () {
    gulp.src('js/*.js') // path to your files
    .pipe(jshint())
    .pipe(jshint.reporter()); // Dump results
});