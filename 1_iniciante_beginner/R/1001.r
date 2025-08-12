#' @source   Beecrowd
#' @problem  1001 - Extremely Basic
#' @subject  Sequential
#'
#' @author   Letícia Cruz
#' @date     2025-08-12

input <- file('stdin', 'r')

a <- as.integer(readLines(input, n=1))
b <- as.integer(readLines(input, n=1))

soma = a + b

writeLines(paste("X =", soma))