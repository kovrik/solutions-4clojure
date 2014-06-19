; restrictions: split-at

(defn split [n coll]
  (conj [] (take n coll) (drop n coll)))

#(conj [] (take %1 %2) (drop %1 %2))


(= (split 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])

(= (split 1 [:a :b :c :d]) [[:a] [:b :c :d]])

(= (split 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])
