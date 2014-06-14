;; restrictions: last

(defn lst [s] (nth s (- (count s) 1)))


(= (lst [1 2 3 4 5]) 5)

(= (lst '(5 4 3)) 3)

(= (lst ["b" "c" "d"]) "d")
