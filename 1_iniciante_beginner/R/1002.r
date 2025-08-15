#' @source   Beecrowd
#' @problem  1002 - Area of a Circle
#' @subject  Sequential
#'
#' @author   Letícia Cruz
#' @date     2025-08-15

input <- file('stdin', 'r')
raio <- as.double(readLines(input, n=1))

π = 3.14159

area <- π * (raio ^ 2)
cat(sprintf("A=%.4f\n", area))