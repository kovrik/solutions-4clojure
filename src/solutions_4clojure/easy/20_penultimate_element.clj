(defn pe [s] (first (drop (- (count s) 2) s)))

(= (pe (list 1 2 3 4 5)) 4)

(= (pe ["a" "b" "c"]) "b")

(= (pe [[1 2] [3 4]]) [1 2])
